package com.example.stockspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPO;
import com.example.stockspring.model.Sectors;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl {

	@Autowired
	private CompanyService companyService;

	/*
	 * @ModelAttribute("company") public List<String> setValues() { List<String>
	 * company = new ArrayList<String>(); company.add("Company");
	 * company.add("Sector");
	 * 
	 * return company; }
	 * 
	 * @ModelAttribute("stock") public List<String> setStock() { List<String> stock
	 * = new ArrayList<String>(); stock.add("BSE"); stock.add("NSE"); return stock;
	 * }
	 * 
	 * @RequestMapping(path = "/com") public String com(Model model) {
	 * model.addAttribute("c", new Sectors()); model.addAttribute("c", new IPO());
	 * return "ComparisonPage"; }
	 */

	@RequestMapping(path = "/insert", method = RequestMethod.GET)
	public String insert(ModelMap model) {
		Company c = new Company();
		model.addAttribute("company", c);
		return "createCompany";
	}

	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public String insertCompany(@Valid @ModelAttribute("company") Company company, BindingResult result, Model model)
			throws Exception {
		if (result.hasErrors()) {

			// System.out.println(result.getAllErrors());
			// model.addAttribute("company", company);
			return "createCompany";
		}
		companyService.insertCompany(company);
		return "redirect:/companyList";
	}

	@RequestMapping(path = "update")
	public String updateCompany(Company company) {

		return null;
	}

	@RequestMapping(path = "/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList", companyService.getCompanyList());
		return mv;
	}

	/*
	 * @RequestMapping(path="/hi")public class HelloController
	 * { @RequestMapping(path="/employeeId/{id}") @ResponseBody public String
	 * sayHello(@PathVariable int id){ System.out.println("hello"); return
	 * id+": I want to seee this content in the browser"; }
	 */
}
