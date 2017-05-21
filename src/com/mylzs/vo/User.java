package com.mylzs.vo;

public class User {
	private String name;
	
	public User(String name) {
		super();
		System.out.println("有参创建!");
		this.name = name;
	}
	public User() {
	
		System.out.println("无参构造方法");
	}
//	public void setName(String name) {
//		this.name = name;
//	}
		public void show() {
			System.out.println("名字是："+name);

		}
}
