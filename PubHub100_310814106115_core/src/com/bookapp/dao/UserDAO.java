package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	
		public void register(User user) throws ClassNotFoundException, SQLException
		{
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("INSERT INTO users(NAME,email_id,PASSWORD) VALUES (?,?,?)");
		pst.setString(1,user.getName());
		pst.setString(2, user.getEmail_id());
		pst.setString(3,user.getPassword());
		//pst.setInt(4, user.getActive());
		pst.executeUpdate();
		}
		public boolean login(User user) throws ClassNotFoundException, SQLException
		{
			Connection connection= ConnectionUtil.getConnection();
			PreparedStatement pst=connection.prepareStatement("SELECT NAME FROM users WHERE email_id=? AND PASSWORD=?");
			pst.setString(1,user.getEmail_id());
			pst.setString(2, user.getPassword());
			ResultSet rs=pst.executeQuery();
			boolean flag=(false);
			if(rs.next())
			{
				flag=true;
			}
			System.out.println( flag);
			return flag;
			}
		}
		

