package com.sample.maven.interceptors;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AOPBeforeMethod implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
	        System.out.println(" Before method exceuted!");
	}
}