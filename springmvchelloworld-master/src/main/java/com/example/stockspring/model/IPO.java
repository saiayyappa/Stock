package com.example.stockspring.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ipo_planned")
public class IPO {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Company_code")
	@NotNull(message = "price")
	private int companyCode;

	@Column(name = "Stock_exchange")
	@NotNull(message = "price")
	private int stockExchange;

	@Column(name = "price_per_share")
	@NotNull(message = "Price Should not be Empty")
	private BigDecimal priceperShare;

	@Column(name = "remarks")
	@NotEmpty(message = "Please enter Remarks")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Remarks should not contain numbers")
	private String remarks;

	@Column(name = "total_no_of_shares")
	@NotNull
	private int totalShares;

	@Column(name = "open_date_time")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date openDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public int getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}

	public int getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}

	public Date getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getPriceperShare() {
		return priceperShare;
	}

	public void setPriceperShare(BigDecimal priceperShare) {
		this.priceperShare = priceperShare;
	}

}
