package com.mylzs.factory;

import com.mylzs.vo.User;

public class UserDynamicFactory {
	public static User newInstance(String name){
		return new User(name);
	}
}
