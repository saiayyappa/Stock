package com.example.stockspring.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Sectors {

	private int id;

	@NotEmpty(message = "Please enter sectorName")
	@Pattern(regexp = "^[A-Za-z]+$", message = "SectorName should not contain numbers")
	private String sectorName;

	@NotEmpty(message = "Please enter Brief")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Brief should not contain numbers")
	private String brief;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
}
