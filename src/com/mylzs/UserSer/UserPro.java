package com.mylzs.UserSer;

import com.mylzs.ser.UserServer;

public class UserPro implements UserServer {
	UserServerImple serverImple= new UserServerImple();
	public void add() {
		// TODO Auto-generated method stub
		log("add");
		serverImple.add();
	}

	public void delete() {
		// TODO Auto-generated method stub
		log("delete");
		serverImple.delete();
	}

	public void update() {
		// TODO Auto-generated method stub
		log("update");
		serverImple.update();
	}

	public void search() {
		log("search");
		serverImple.search();
		// TODO Auto-generated method stub

	}
	
	
	public void log(String name) {
		System.out.println("执行"+name+"方法");
	}

}
