package com.wangzs.ch1.javaconfig;
//
public class UserFunctionService {
	//
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService){
		this.functionService = functionService;
	}
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
