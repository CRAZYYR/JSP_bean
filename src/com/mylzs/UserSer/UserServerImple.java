package com.mylzs.UserSer;

import com.mylzs.ser.UserServer;

public class UserServerImple implements UserServer {

	public void add() {
	//	log("add");
		// TODO Auto-generated method stub
		System.out.println("执行add方法");
			System.out.println("增加用户!");
	}

	public void delete() {
	//	log("delete");
		System.out.println("执行delete方法");
		// TODO Auto-generated method stub
System.out.println("删除用户");
	}

	public void update() {
	//	log("update");
		System.out.println("update方法");
		// TODO Auto-generated method stub
		System.out.println("修改用户");
	}

	public void search() {
	//	log("search");
//		System.out.println("search方法");
		// TODO Auto-generated method stub
		System.out.println("查询用户");
	}
	
//	public void log(String name) {
//		System.out.println("执行"+name+"方法");
//	}

}
