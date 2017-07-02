package com.bookapp.model;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();

		System.out.println(user.getId());
		user.setId(1);
		System.out.println(user.getId());

		user.setName("Vaishu");
		System.out.println(user.getName());

		user.setEmail_id("vaishu@gmail.com");
		System.out.println(user.getEmail_id());

		user.setPassword("vaishu");
		System.out.println(user.getPassword());

		user.setActive(1);
		System.out.println(user.getActive());

		System.out.println(user.toString());

	}

}
