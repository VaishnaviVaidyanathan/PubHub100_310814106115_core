package com.bookapp.dao;

import java.sql.SQLException;

import com.bookapp.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Book book=new Book();
		// /*book.setName("sql");
		// book.setPrice(1500);*/
		// //book.setPrice(1000);
		// book.setId(2);
		// BookDAO dao=new BookDAO();
		// //dao.edit(book);
		// dao.delete(book);
book.setName("sql");
		BookDAO dao = new BookDAO();
		dao.findByName(book);
	}

}
