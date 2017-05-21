package com.mylzs.ststicproxy;

import com.mylzs.UserSer.UserPro;

public class Client {
	public static void main(String[] args) {
		Host host=new Host();
		Proxy proxy=new Proxy(host);
		proxy.rent();
		UserPro pro=new UserPro();
		pro.add();
		pro.update();
		pro.search();
		pro.delete();
	}
		
}
