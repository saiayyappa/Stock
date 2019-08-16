package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockExchangeDao;
import com.example.stockspring.model.StockExchange;
@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeDao stockExchangeDao;
	
	@Override
	public StockExchange stockInsert(StockExchange stock) {
		// TODO Auto-generated method stub
		return stockExchangeDao.save(stock);
	}

	@Override
	public List<StockExchange> stockList() {
		// TODO Auto-generated method stub
		return stockExchangeDao.findAll();
	}

}
