package com.wangzs.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//
public class JavaConfig {
	@Bean // 注解声明当前方法FunctionService的返回值是一个Bean,Bean的名称是方法名
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean
	public UserFunctionService userFunctionService(){
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionService(functionService()); //注入functionService的bean时候直接调用functionService()。
		return userFunctionService;
		
	}
	
	/*@Bean
	public UserFunctionService userFunctionService(FunctionService functionService){
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionService(functionService());
		return userFunctionService;
		
	}*/

}
