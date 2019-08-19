package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;
import com.dhanjyothi.util.DhanJyothiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.User;

@Controller
public class LoginController {

	@Autowired
	LoginDao loginDao;

	@Autowired
	AccountDao accountDao;

	@Autowired
	DhanJyothiUtil util;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView();
		// added for page redirection from registration to handle binding results.
		User user = new User();
		mav.addObject("user", user);
		mav.setViewName("login");
		return mav;
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("user") User user, HttpServletRequest request, Model model) {
		int result = loginDao.validateUser(user);
		if (result == 1) {
			try {
				User userInfo = accountDao.getUserDetails(user);
				// model.addAttribute("userid",userInfo.getUser_id());
				request.getSession().setAttribute("userid", userInfo.getUser_id());
				request.getSession().setAttribute("username", userInfo.getFirst_name());
				Account accountDetails = accountDao.getAccountDetails(userInfo.getUser_id(), "S");
				if (accountDetails != null) {
					model.addAttribute("accountDetails", accountDetails);
				}
			} catch (Exception e) {
				e.getMessage();
			}
			return "accountsummary";
		} else {
			model.addAttribute("message", "Invalid Credentials");
			return ("login");
		}
	}

	@RequestMapping("/accsummary")
	public String loadAccSummary(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getSession().getAttribute("userid").toString());
		Account accountDetails;
		try {
			accountDetails = accountDao.getAccountDetails(userId, "S");
			if (accountDetails != null) {
				model.addAttribute("accountDetails", accountDetails);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "accountsummary";
	}

	@RequestMapping("/adduser")
	public String addUser(HttpServletRequest request, Model model) {
		return null;
	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:" + "/login";
	}

}
