package com.mylzs.dynamic;

import com.mylzs.info.UserInfo;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Host host=new Host();
//		ProxyInvocationHandler handler=new ProxyInvocationHandler();
//		handler.setObject(host);
//		Rent rent=(Rent) handler.getPro();
//		rent.rent();
		User user1=new User();
		ProxyInvocationHandler handler=new ProxyInvocationHandler();
		handler.setObject(user1);
		User user=(User) handler.getPro();
		user.add();
		
	}

}
