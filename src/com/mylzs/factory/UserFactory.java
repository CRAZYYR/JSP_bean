package com.mylzs.factory;

import com.mylzs.vo.User;

/**
 * 
 * @author Go With Me
 *【静态工厂方式创建】
 */
public class UserFactory {
		public static User newInstance(String name){
			return new User(name);
		}
}
