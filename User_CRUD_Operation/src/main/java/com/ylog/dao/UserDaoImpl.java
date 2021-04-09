package com.ylog.dao;

import java.util.ArrayList;
import java.util.List;

import com.ylog.bean.User;

public class UserDaoImpl implements UserDao{
	
	public static List<User> userList = new ArrayList<>();

	@Override
	public String addMultipleUserName(List<User> userList) {
		userList.addAll(userList);
		System.out.println("User Added successfully"+userList);
		return "User added succesfully";
	}

	@Override
	public String addUser(User user) {
		userList.add(user);
		System.out.println("User Added successfully "+userList);
		return "Single  User added succesfully";
	}

}
