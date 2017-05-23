package com.mylzs.log;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
@Aspect
public class Log {

//public void before(Method method, Object[] arg1, Object target) throws Throwable {
//	System.out.println(target.getClass().getName()+"的 "+method.getName()+"方法执行");
//	
//}
	@Before("execution(* com.mylzs.dynamic.*.*(..))")
	public void before(){
		System.out.println("方法执行前...");
	}
	@After("execution(* com.mylzs.dynamic.*.*(..))s")
	public void after(){
		System.out.println("方法执行后...");
	}
	
}
