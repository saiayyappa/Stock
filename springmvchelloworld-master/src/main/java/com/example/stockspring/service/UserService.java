package com.example.stockspring.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.stockspring.model.Userdb;

public interface UserService {

	public Userdb register(Userdb user) throws Exception;

	
	

}
