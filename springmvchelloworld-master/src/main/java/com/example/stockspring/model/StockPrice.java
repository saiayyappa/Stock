package com.example.stockspring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "stock_price")
public class StockPrice {

	@Id
	@Column(name = "stock_code")
	private int stockCode;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_code")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@NotEmpty(message = "Please enter CurrentPrice")
	@Column(name = "current_price")
	private double currentPrice;

	@NotEmpty(message = "Please enter Date")
	@Column(name = "date")
	private String date;

	@NotEmpty(message = "Please enter Time")
	@Column(name = "time")
	private String time;

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}

}
