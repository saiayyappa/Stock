package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.StockPrice;

@Service
public class StockPriceImpl implements StockPriceService {

	@Autowired
	StockPriceDao stockPriceDao;

	@Override
	public List<StockPrice> stockPriceList() {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

}
