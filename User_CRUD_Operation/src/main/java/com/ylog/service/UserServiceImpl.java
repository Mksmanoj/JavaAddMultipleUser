package com.ylog.service;

import java.util.List;

import com.ylog.bean.User;
import com.ylog.dao.UserDao;
import com.ylog.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public String addMultipleUserName(List<User> userList) {
		if(userList.isEmpty()) {
			return "Can't persist empty user";
		}
		String result = userDao.addMultipleUserName(userList);
		return result;
	}

	@Override
	public String addUser(User user) {
		if(null == user.getFirstname()|| user.getFirstname().isEmpty()) {
			return "Mandatory field for first Name";
		}
		String result = userDao.addUser(user);
		return result;
	}

}
