package com.dhanjyothi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;

@Controller
public class RegisterController {

	@Autowired
	public RegisterDao registerDao;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)

	public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		mav.addObject("user", user);
		mav.setViewName("signup");
		return mav;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveRegister(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {

		ModelAndView mav = new ModelAndView();
		if (bindingResult.hasErrors()) {
			mav.setViewName("signup");
		} else {
			registerDao.saveRegister(user);
			mav.addObject("message", "Hi " + user.getUserName() + " you are registered Successfully");
			mav.setViewName("login");
		}
		return mav;
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ModelAndView getAllUsers() {

		return new ModelAndView("");
	}

}
