package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.IpoDao;
import com.example.stockspring.model.IPO;

@Service
public class IpoServiceImpl implements IpoService{
	@Autowired
	IpoDao ipoDao;
	
	public IPO ipoInsert(IPO ipo) {
		return ipoDao.save(ipo);
	}
	public List<IPO> ipoList() {
		return ipoDao.findAll();
	}
}
