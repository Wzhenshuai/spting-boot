package com.wangzs.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args){
		//ʹ��AnnotationConfigApplicationContext ��ΪSpring��������������һ����������Ϊ����
		AnnotationConfigApplicationContext context	= new AnnotationConfigApplicationContext(DiConfig.class);
		//����������õ�userFunctionService bean
		UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
		
		System.out.println(userFunctionService.SayHello("di"));
		
		context.close();
	
	}
}
