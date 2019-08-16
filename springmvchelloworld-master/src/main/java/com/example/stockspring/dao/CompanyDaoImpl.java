
package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;
/*
@Repository
public class CompanyDaoImpl implements CompanyDao {

	public static Connection connect() throws Exception {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		return conn;

	}

	public Company insertCompany(Company company1) throws Exception {
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement(
				"insert into company (company_code,company_Name,turnover,ceo,boardofdirectors,sector_id,breifwriteup) value(?,?,?,?,?,?,?)");
		ps.setInt(1, company1.getCompanyCode());
		ps.setString(2, company1.getCompanyName());
		ps.setDouble(3, company1.getTurnOver());
		ps.setString(4, company1.getCeo());
		ps.setString(5, company1.getBoardofDirectors());
		ps.setInt(6, company1.getSectorid());
		ps.setString(7, company1.getBrief());
		// ps.setInt(7, company1.getStockCode());
		ps.executeUpdate();
		return company1;
	}

	public List<Company> getCompanyList() throws Exception {
		List<Company> companyList = new ArrayList<Company>();
		try {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement("select * from company");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Company company = new Company();
				int companyId = rs.getInt("company_code");

				company.setCompanyCode(companyId);
				company.setBoardofDirectors(rs.getString("boardofDirectors"));
				company.setCompanyName(rs.getString("company_Name"));
				company.setSectorid(rs.getInt("sector_id"));
				company.setTurnOver(rs.getDouble("turnover"));
				company.setCeo(rs.getString("ceo"));
				company.setBrief(rs.getString("breifwriteup"));

				companyList.add(company);
			}
		} catch (SQLException e) {
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/