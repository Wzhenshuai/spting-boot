package com.wangzs.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//
public class JavaConfig {
	@Bean // ע��������ǰ����FunctionService�ķ���ֵ��һ��Bean,Bean�������Ƿ�����
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean
	public UserFunctionService userFunctionService(){
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionService(functionService()); //ע��functionService��beanʱ��ֱ�ӵ���functionService()��
		return userFunctionService;
		
	}
	
	/*@Bean
	public UserFunctionService userFunctionService(FunctionService functionService){
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionService(functionService());
		return userFunctionService;
		
	}*/

}
