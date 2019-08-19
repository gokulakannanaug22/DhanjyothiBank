package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@Autowired
	AccountDao accountDao;

/*	@GetMapping("/createsavingsaccount")
	public String loadAccountCreationPage(Model model, HttpServletRequest request) {
		
		// Admin part & logger  are not implemented, considering that by default all accounts are
		// savings account and all new account are Active
		int loggedInUserId = Integer.parseInt(request.getSession().getAttribute("userid").toString());
		try {
			// User user = accountDao.getUserById(loggedInUserId);
			Account existingAccount = accountDao.getAccountDetails(loggedInUserId, "S");
			//System.out.println("accountDetails 1 >>" + existingAccount);
			if (existingAccount == null) {
				Account account = new Account();
				account.setAcct_type("S");
				account.setAcc_balance(10000.00);
				account.setAcc_status("A");
				account.setInt_rate(4);
				account.setDeposit_tenure(0);
				account.setMaturity_amt(0.0);
				account.setAcct_holder_id(loggedInUserId);
				accountDao.openSavingsAccount(account, false);
				model.addAttribute("accountDetails", accountDao.getAccountDetails(loggedInUserId, "S"));
				// System.out.println("accountDetails 2 >>"+accountDetails);
			} else {
				//System.out.println("accountDetails 3 >>" + existingAccount);
				model.addAttribute("accountDetails", existingAccount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return "accountsummary";
	}
	*/
	
	@GetMapping("/createsavingsaccount")
	public String loadAccountCreationPage(Model model, HttpServletRequest request) {
		// Admin part & logger  are not implemented, considering that by default all accounts are
				// savings account and all new account are Active
				int loggedInUserId = Integer.parseInt(request.getSession().getAttribute("userid").toString());
				try {
					// User user = accountDao.getUserById(loggedInUserId);
					Account existingAccount = accountService.getAccountDetails(loggedInUserId, "S");
					//System.out.println("accountDetails 1 >>" + existingAccount);
					if (existingAccount == null) {
						Account account = new Account();
						account.setAcct_type("S");
						account.setAcc_balance(10000.00);
						account.setAcc_status("A");
						account.setInt_rate(4);
						account.setDeposit_tenure(0);
						account.setMaturity_amt(0.0);
						account.setAcct_holder_id(loggedInUserId);
						accountDao.openSavingsAccount(account, false);
						model.addAttribute("accountDetails", accountDao.getAccountDetails(loggedInUserId, "S"));
						// System.out.println("accountDetails 2 >>"+accountDetails);
					} else {
						//System.out.println("accountDetails 3 >>" + existingAccount);
						model.addAttribute("accountDetails", existingAccount);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				return "accountsummary";
	}

	@GetMapping("/loadtermaccount")
	public String loadTermAccount(@ModelAttribute("account") Account account, Model model) {

		return null;
	}

	@PostMapping("/createtermaccount")
	public String createTermAccount(@ModelAttribute("account") Account account, Model model, HttpServletRequest request,
			BindingResult bindingResult) {
		return null;
	}

	@GetMapping("/viewtransactions")
	public String loadTransactionDetails(Model model, HttpServletRequest request) {
		return null;
	}
}
