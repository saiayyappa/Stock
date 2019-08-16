package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "user")
public class Userdb {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	@NotEmpty(message = "Username should not be empty")
	@Pattern(regexp = "^[A-Za-z]+$", message = "userName should not contain numbers")
	private String userName;

	@Column(name = "password")
	@NotEmpty(message = "Password should not be empty")
	private String password;

	@Column(name = "usertype")
	@NotEmpty(message = "Usertype should not be empty")
	@Pattern(regexp = "^[A-Za-z]+$", message = "UserType should not contain numbers")
	private String userType;

	@Column(name = "email")
	@NotEmpty(message = "Email should not be empty")
	@Email
	private String email;

	@Column(name = "mobilenumber")
	private int mobileNumber;

	@Column(name = "confirmed")
	private byte confirmed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(byte confirmed) {
		this.confirmed = confirmed;
	}

}
