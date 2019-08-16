package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Override
	public Company insertCompany(Company company) throws Exception {
		// TODO Auto-generated method stub
		/* companyDao.insertCompany(company); */
		return companyDao.save(company);
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws Exception {
		return companyDao.findAll();
	}

}
