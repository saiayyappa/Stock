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

import com.example.stockspring.model.StockExchange;
import com.example.stockspring.model.Userdb;
import com.example.stockspring.service.StockExchangeService;

@Controller
public class StockExchangeController {

	@Autowired
	StockExchangeService stockExchangeService;

	@RequestMapping(path = "/stockInsert", method = RequestMethod.GET)
	public String stockInsert(Model model) {
		StockExchange stock = new StockExchange();
		model.addAttribute("stock", stock);
		return "stock";

	}

	@RequestMapping(path = "/stockInsert", method = RequestMethod.POST)
	public String stockInsert(@Valid @ModelAttribute("stock") StockExchange stock, BindingResult result)
			throws Exception {
		if (result.hasErrors())

		{
			return "stock";
		}

		stockExchangeService.stockInsert(stock);
		return "redirect:/stockList";
	}

	@RequestMapping(path = "/stockList", method = RequestMethod.GET)
	public ModelAndView stockList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("stockList");
		mav.addObject("stockList", stockExchangeService.stockList());
		return mav;
	}
}
