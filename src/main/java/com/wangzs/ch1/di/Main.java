package com.wangzs.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args){
		//使用AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context	= new AnnotationConfigApplicationContext(DiConfig.class);
		//获得声明配置的userFunctionService bean
		UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
		
		System.out.println(userFunctionService.SayHello("di"));
		
		context.close();
	
	}
}
