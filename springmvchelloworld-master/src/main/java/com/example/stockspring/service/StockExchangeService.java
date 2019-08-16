package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.StockExchange;

public interface StockExchangeService {

	public StockExchange stockInsert(StockExchange stock);

	public List<StockExchange> stockList();

}
