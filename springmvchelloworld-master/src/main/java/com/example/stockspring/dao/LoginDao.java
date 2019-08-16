package com.example.stockspring.dao;

import com.example.stockspring.model.Userdb;

public interface LoginDao {
	public Userdb login(Userdb user) throws Exception;
}
