package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {
	/*public Company insertCompany(Company company) throws  Exception;

	public Company updateCompany(Company company);

	public List<Company> getCompanyList() throws  Exception;
*/
}
