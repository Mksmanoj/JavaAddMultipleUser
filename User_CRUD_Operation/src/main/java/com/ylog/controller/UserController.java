package com.ylog.controller;

import java.util.List;

import com.ylog.bean.User;

public interface UserController {

	public String addMultipleUserName(List<User> userList);

	public String addUser(User user);
}
