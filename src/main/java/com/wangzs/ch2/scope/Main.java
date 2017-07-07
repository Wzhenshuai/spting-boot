package com.wangzs.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = (DemoSingletonService) context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = (DemoSingletonService) context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = (DemoPrototypeService) context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = (DemoPrototypeService) context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1��s2�Ƿ���ȣ� "+s1.equals(s2));
		System.out.println("p1��p2�Ƿ���ȣ� "+p1.equals(p2));
		
		context.close();
	}
}
