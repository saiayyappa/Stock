package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.IPO;

public interface IpoDao extends JpaRepository<IPO, Integer>{

}
