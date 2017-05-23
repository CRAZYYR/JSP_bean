package com.mylzs.log;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLog implements ThrowsAdvice {
	public void afterThrowing(Method method) throws Throwable {
		// Do something with remote exception
		method.getClass().getName();
	}

}
