package com.mylzs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mylzs.info.UserInfo;
import com.mylzs.vo.User;
/**
 * 
 * @author Go With Me
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		User user= (User) ac.getBean("user1");
		user.show();
		
		ApplicationContext bc=new ClassPathXmlApplicationContext("spring/xml/info.xml");
		UserInfo info= (UserInfo) bc.getBean("userinfo");
		info.show();
	
		com.mylzs.info.User user2=(com.mylzs.info.User) bc.getBean("user_info");
		user2.show();
		
		user2=(com.mylzs.info.User) bc.getBean("user_01");
		
		user2.show();

	}

}
