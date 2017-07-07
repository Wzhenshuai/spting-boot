package com.wangzs.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //注解声明当前UserFunctionService 是spring管理的一个Bean
public class UserFunctionService {
	@Autowired  //将functionService 的实体注入到 UserFunctionService中  使UserFunctionService 具备 FunctionService的功能
	FunctionService functionService;
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
