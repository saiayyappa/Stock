package com.example.stockspring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Userdb;
import com.example.stockspring.service.LoginService;
import com.example.stockspring.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private LoginService loginService;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		Userdb user = new Userdb();
		model.addAttribute("user", user);
		return "registration";

	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") Userdb user, BindingResult result) throws Exception {
		if (result.hasErrors())

		{
			return "registration";
		}

		userService.register(user);
		return "redirect:/login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		Userdb user1 = new Userdb();
		model.addAttribute("user", user1);
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute("user") Userdb user, BindingResult result) throws Exception {
		Userdb user1 = null;
		ModelAndView mav = null;
		if (result.hasErrors())

		{
			mav = new ModelAndView("login");
		}

		user1 = loginService.login(user);

		if ((user.getUserName().equals(user1.getUserName())) && (user.getPassword().equals(user1.getPassword()))
				&& (user.getId() == (user1.getId()))) {

			if (user.getUserName().equals("Admin")) {
				mav = new ModelAndView("adminLandingPage");
			} else {
				mav = new ModelAndView("userLanding");
			}
		} else {
			System.out.println("kkkk");
			mav = new ModelAndView("login", "message", "Invalid Username or Password");
		}
		return mav;

	}

}
