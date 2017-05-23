package com.mylzs.dynamic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//		User user1=new User();
//		ProxyInvocationHandler handler=new ProxyInvocationHandler();
//		handler.setObject(user1);
//		UserInfe user= (UserInfe) handler.getPro();
//		user.update();
		ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
		User user=(User) app.getBean("user");
		user.add();
		
	}

}
