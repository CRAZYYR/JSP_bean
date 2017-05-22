package com.mylzs.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
	private Object object;
	public void setObject(Object object) {
		this.object = object;
	}
	public Object getPro(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(),this );
	}
	
	/**
	 * proxy 代理类
	 * method  代理类调用处理程序的方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		log(method.getName());
		//System.out.println(method.getName());
		Object result= method.invoke(object, args);
		// TODO Auto-generated method stub
		return result;
	}
	public void log(String name){
		System.out.println("执行了"+name+"方法");
	}

}
