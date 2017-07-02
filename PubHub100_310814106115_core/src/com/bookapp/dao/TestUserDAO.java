package com.bookapp.dao;

import java.sql.SQLException;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
User user=new User();
user.setName("subhahashini1");
user.setEmail_id("subha2@gmail.com");
user.setPassword("subha2");
user.setActive(1);
UserDAO dao=new UserDAO();
dao.register(user);
User user1=new User();
dao.login(user1);

	}

}
