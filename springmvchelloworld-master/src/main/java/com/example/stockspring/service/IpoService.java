package com.example.stockspring.service;

import java.util.List;

import javax.validation.Valid;

import com.example.stockspring.model.IPO;

public interface IpoService {

	public IPO ipoInsert(IPO ipo);

	public List<IPO> ipoList();

}
