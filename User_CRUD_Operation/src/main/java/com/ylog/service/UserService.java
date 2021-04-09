package com.ylog.service;

import java.util.List;

import com.ylog.bean.User;

public interface UserService {

	public String addMultipleUserName(List<User> userList);

	public String addUser(User user);
}
