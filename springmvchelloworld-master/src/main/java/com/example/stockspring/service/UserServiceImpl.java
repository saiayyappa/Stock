package com.example.stockspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.Userdb;
@Service
public class UserServiceImpl implements UserService {
@Autowired 
UserDao userDao;
	@Override
	public Userdb register(Userdb user) throws Exception {
		return userDao.save(user);
		
	}
	

}
