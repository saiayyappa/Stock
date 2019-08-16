package com.example.stockspring.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@Column(name = "company_code")
	private int companyCode;

	@NotEmpty(message = "Please enter CompanyName")
	@Pattern(regexp = "^[A-Za-z]+$", message = "companyname should not contain numbers")
	@Column(name = "company_Name")
	private String companyName;
	
	@Column(name = "turnover")
	private BigDecimal turnOver;
	
	@NotEmpty(message = "Please enter CEO")
	@Pattern(regexp = "^[A-Za-z]+$", message = "CEO should not contain numbers")
	@Column(name = "ceo")
	private String ceo;

	@NotEmpty(message = "Please enter Board Of Directives")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Board Of Directives should not contain numbers")
	@Column(name = "boardofdirectors")
	private String boardofDirectors;

	@Column(name = "sector_id")
	private int sectorid;

	@NotEmpty(message = "Please enter Brief")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Brief should not contain numbers")
	@Column(name = "breifwriteup")
	private String brief;

	

	public int getSectorid() {
		return sectorid;
	}

	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}

	public String getBoardofDirectors() {
		return boardofDirectors;
	}

	public void setBoardofDirectors(String boardofDirectors) {
		this.boardofDirectors = boardofDirectors;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	public BigDecimal getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceo=" + ceo + ", boardofDirectors=" + boardofDirectors + ", sectorid=" + sectorid + ", brief="
				+ brief + ", stockCode=" +  "]";
	}

}

/*
 * Company related Data Fields: Company Name Turnover CEO Board of Directors
 * Listed in Stock Exchanges Sector Brief writeup Stock code in each Stock
 * Exchange
 * 
 * Stock Price details Excel: Company Code Stock Exchange Current Price Date
 * Time
 * 
 * IPOs planned: id Company Name Stock Exchange Price per share Total number of
 * Shares Open Date Time Remarks
 * 
 * Sectors data Fields: Id Sector Name Brief
 * 
 * User DB Table: Id Username Password UserType(if Admin or normal User) E-mail
 * Mobile number Confirmed
 * 
 * Stock Exchange Data Fields: Id Stock Exchange Brief Contact Address Remarks
 * 
 * 
 * You may consider 3 or 4 sample sectors, as a sample data
 */