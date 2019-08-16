package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Userdb;

@Repository
public class UserDaoImpl implements LoginDao {

	public static Connection connect() throws Exception {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		return conn;

	}

	/*
	 * @Override public Userdb register(Userdb user) throws Exception { Connection
	 * conn = connect(); PreparedStatement ps = conn.prepareStatement(
	 * "insert into user(id,username,password,usertype,email,mobilenumber) values(?,?,?,?,?,?)"
	 * ); ps.setInt(1, user.getId()); ps.setString(2, user.getUserName());
	 * ps.setString(3, user.getPassword()); ps.setString(4, user.getUserType());
	 * ps.setString(5, user.getEmail()); ps.setInt(6, user.getMobileNumber()); //
	 * ps.setBoolean(7, (Boolean) null); ps.executeUpdate(); return user; }
	 */
	@Override
	public Userdb login(Userdb user) throws Exception {
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement("select * from user where id=?");
		ps.setInt(1, user.getId());

		ResultSet rs = ps.executeQuery();
		Userdb user1 = new Userdb();

		while (rs.next()) {
			user1.setId(rs.getInt(1));
			user1.setUserName(rs.getString(2));
			user1.setPassword(rs.getString(3));
		}

		return user1;
	}

}
