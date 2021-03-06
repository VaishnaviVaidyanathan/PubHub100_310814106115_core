package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO {

	public void save(Book book)  {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = null;
		try {
			pst = connection.prepareStatement("INSERT INTO books(NAME,price) VALUES(?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setString(1, book.getName());
			pst.setInt(2, book.getPrice());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void edit(Book book) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("UPDATE books SET price=? WHERE id=?");
		pst.setInt(1, book.getPrice());
		pst.setInt(2, book.getId());
		pst.executeUpdate();
	}

	public void delete(Book book) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("DELETE FROM books WHERE id=?");
		pst.setInt(1, book.getId());
		pst.executeUpdate();
	}

	public List<Book> listAll() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("SELECT NAME,price FROM books");
		ResultSet rs = pst.executeQuery();
		List<Book> books = new ArrayList<>();
		while (rs.next()) {
			Book book1 = new Book();
			book1.setName(rs.getString(1));
			book1.setPrice(rs.getInt(2));
			books.add(book1);
		}
		System.out.println(books.size());
		return books;
	}

	public List<Book> findByName(Book book)  {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = null;
		try {
			pst = connection.prepareStatement("SELECT name,price FROM books where name=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pst.setString(1, book.getName());
			ResultSet rs = pst.executeQuery();
			List<Book> books = new ArrayList<>();
			while (rs.next()) {
				Book book1 = new Book();
				book1.setName(rs.getString(1));
				book1.setPrice(rs.getInt(2));
				books.add(book1);
			}
			System.out.println(books.size());
			return books;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
