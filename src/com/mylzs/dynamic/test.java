package com.mylzs.dynamic;

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
		UserInfe user= (UserInfe) handler.getPro();
		user.delete();
		
	}

}
