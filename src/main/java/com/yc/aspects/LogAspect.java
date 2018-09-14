package com.yc.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {

	@Before("execution(* com.yc.biz.impl.StudentBizImpl.reg(..))")
	public void  aspLog(){
		System.out.println("-----------------");
		System.out.println("注册成功");
		System.out.println("-----------------");
	}
	
	@Pointcut("execution(* com.yc.biz.impl.StudentBizImpl.reg(..))")
	public void log(){}
}
