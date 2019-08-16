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

import com.example.stockspring.model.IPO;

import com.example.stockspring.service.IpoService;

@Controller
public class IPOController {
	@Autowired
	IpoService ipoService;
	@RequestMapping(path = "/ipoInsert", method = RequestMethod.GET)
	public String ipoInsert(Model model) {
		IPO ipo = new IPO();
		model.addAttribute("ipo", ipo);
		return "ipo";

	}

	@RequestMapping(path = "/ipoInsert", method = RequestMethod.POST)
	public String ipoInsert(@Valid @ModelAttribute("ipo") IPO ipo, BindingResult result)
			throws Exception {
		if (result.hasErrors())

		{
			return "ipo";
		}

		ipoService.ipoInsert(ipo);
		return "redirect:/ipoList";
	}

	@RequestMapping(path = "/ipoList", method = RequestMethod.GET)
	public ModelAndView ipoList() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ipoList",ipoService.ipoList());
		return mav;
	}
}
