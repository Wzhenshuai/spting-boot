package com.wangzs.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // 注解声明一个切面
@Component // 让此切面成为Spring容器管理的Bean
public class LogAspect {
	@Pointcut("@annotation(com.wangzs.ch1.aop.Action)") // 注解声明切点
	public void annotationPointCut() {
	};

	@After("annotationPointCut()") // 注解声明一个建言，并使用@PointCut定于切点
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截after  " + action.name()); // 反射获得注解上的属性，然后做日志记录相关的操作
	}

	@Before("execution(* com.wangzs.ch1.aop.DemoMethodService.*(..))") // 声明一个建言，直接使用拦截规则作为参数
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("注解式拦截before " + method.getName());
	}

}
