package com.ylog.Test;

import java.util.ArrayList;
import java.util.List;

import com.ylog.bean.User;
import com.ylog.controller.UserController;
import com.ylog.controller.UserControllerImp;

public class Test {
	
	static UserController userController = new UserControllerImp();
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
//		List<User> list1 = new ArrayList<>();

		User user1 = new User(1, "manoj", "m22", "m45", 5, "m1");
		User user2 = new User(2, "sonu", "m23", "m46", 5, "m1");
		User user3 = new User(3, "mks", "m23", "m56", 5, "m1");
//		User user4 = new User(4, "skdfjhksjd", "m24", "m55", 5, "m1");

		list.add(user1);
		list.add(user2);
		list.add(user3);
//		list.add(user4);
		
		String result = userController.addMultipleUserName(list);
//		String result = userController.addMultipleUserName(list1);
		System.out.println(result);
		
//		String singleResult = userController.addUser(user4);
//		System.out.println(singleResult);
		
	}

}
