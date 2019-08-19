package com.dhanjyothi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;

@Controller
public class FundTransferController {

	@Autowired
	AccountDao accountDao;

	@GetMapping("/loadbeneficiary")
	public String loadBeneficiaryPage() {
		return "beneficiarytype";
	}

	@GetMapping("/loadtransfer")
	public String loadTransferPage(@ModelAttribute("transaction") Transaction transaction, Model model,
			HttpServletRequest request) {
		try {
			List<Beneficiaries> beneficiaries = accountDao
					.getAllBeneficiaries(Integer.parseInt(request.getSession().getAttribute("userid").toString()));
			model.addAttribute("beneficiaries", beneficiaries);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "transfer";
	}

	@GetMapping("/beneficiarywithinbank")
	public String beneficiarywithinbank(@ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model) {
		return "addbeneficiary";
	}

	@GetMapping("/beneficiaryotherbank")
	public String beneficiaryotherbank(@ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model) {

		return "addbeneficiary";
	}

	@PostMapping("/savebeneficiary")
	public String saveBeneficiary(@Valid @ModelAttribute("beneficiary") Beneficiaries beneficiary, Model model,
			BindingResult bindingResult, HttpServletRequest request) {
		try {
			// check whether the account exist or not
			System.out.print("beneficiary.getBenAccNumber()  >>" + beneficiary.getBenAccNumber());
			Account acctDetails = accountDao.checkAccountExists(Integer.parseInt(beneficiary.getBenAccNumber()));
			System.out.print("acctDetails >>" + acctDetails);
			if (acctDetails != null) {
				// duplicate beneficiaries are added now >> condition to be added.
				beneficiary.setOwnerID(Integer.parseInt(request.getSession().getAttribute("userid").toString()));
				accountDao.saveBeneficiaries(beneficiary);
				model.addAttribute("message", " Beneficiary Added Successfully");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			model.addAttribute("message", "Invalid Beneficiary Account Number");
		}
		return "redirect:" + "/accsummary";
	}

	@PostMapping("/transferamt")
	public String transferAmount(@ModelAttribute("transaction") Transaction transaction, Model model,
			BindingResult bindingResult, HttpServletRequest request) {
		try {
			Account acc = accountDao
					.getAccountDetails(Integer.parseInt(request.getSession().getAttribute("userid").toString()), "S");
			transaction.setDebit_acct(acc.getAcct_id());
			accountDao.updateTransactionDetails(transaction);
			model.addAttribute("message" + "Funds Transferred Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			model.addAttribute("message", e.getMessage());
		}
		return "redirect:" + "/accsummary";
	}
}
