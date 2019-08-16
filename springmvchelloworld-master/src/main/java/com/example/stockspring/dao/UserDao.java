package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.Userdb;

public interface UserDao extends JpaRepository<Userdb, Integer> {

	

	/*public Userdb register(Userdb user) throws Exception;

	public Userdb login(Userdb user) throws Exception;
	*/
	

}
