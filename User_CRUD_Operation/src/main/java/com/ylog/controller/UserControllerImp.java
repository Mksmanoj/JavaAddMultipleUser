package com.ylog.controller;

import java.util.List;

import com.ylog.bean.User;
import com.ylog.service.UserService;
import com.ylog.service.UserServiceImpl;

public class UserControllerImp implements UserController {

	UserService userService = new UserServiceImpl();
	
	@Override
	public String addMultipleUserName(List<User> userList) {
		String result = userService.addMultipleUserName(userList);
		return result;
	}

	@Override
	public String addUser(User user) {
		String result = userService.addUser(user);
		return result;
	}

}
