package com.example.stockspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.IPO;
import com.example.stockspring.model.Sectors;
import com.example.stockspring.service.StockPriceService;

@Controller
public class SectorContoller {
	
	@Autowired
	StockPriceService stockPriceService;
	@ModelAttribute("sector")
	public List<String> setValues() {
		List<String> company = new ArrayList<String>();
		company.add("Company");
		company.add("Sector");

		return company;
	}

	/*@ModelAttribute("stock")
	public List<String> setStock() {
		List<String> stock = new ArrayList<String>();
		stock.add("BSE");
		stock.add("NSE");
		return stock;
	}*/

	@RequestMapping(path = "/com")
	public String com(@ModelAttribute("c") Model model) {
		Sectors sector=new Sectors();
		model.addAttribute("c", sector);
		/*model.addAttribute("c", new IPO());*/
		return "ComparisonPage";
	}
	@RequestMapping(path = "/stockPriceList", method = RequestMethod.GET)
	public ModelAndView stockList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("stockPrice");
		mav.addObject("stockPriceList", stockPriceService.stockPriceList());
		return mav;
	}
}
