package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "stockexchange")
public class StockExchange {
	@Id
	@Column(name = "stockexchange_id")
	private int stockexchangeId;

	@Column(name = "stockexcname")
	@NotEmpty(message = "Please enter StockexchangeName")
	@Pattern(regexp = "^[A-Za-z]+$", message = "StockexchangeName should not contain numbers")
	private String stockexchangeName;

	@Column(name = "brief")
	@NotEmpty(message = "Please enter Brief")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Brief should not contain numbers")
	private String brief;

	@Column(name = "contactaddress")
	@NotEmpty(message = "Please enter ContactAddress")
	@Pattern(regexp = "^[A-Za-z]+$", message = "ContactAddress should not contain numbers")
	private String contactAddress;

	@Column(name = "remarks")
	@NotEmpty(message = "Please enter Remarks")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Remarks should not contain numbers")
	private String remarks;

	public String getStockexchangeName() {
		return stockexchangeName;
	}

	public void setStockexchangeName(String stockexchangeName) {
		this.stockexchangeName = stockexchangeName;
	}

	public int getStockexchangeId() {
		return stockexchangeId;
	}

	public void setStockexchangeId(int stockexchangeId) {
		this.stockexchangeId = stockexchangeId;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
