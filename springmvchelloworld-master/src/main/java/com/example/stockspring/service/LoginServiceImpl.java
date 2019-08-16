package com.example.stockspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.LoginDao;
import com.example.stockspring.model.Userdb;
@Service
public class LoginServiceImpl implements LoginService {
@Autowired
LoginDao loginDao;

	@Override
	public Userdb login(Userdb user) throws Exception {
		// TODO Auto-generated method stub
		return loginDao.login(user);
	}

}
