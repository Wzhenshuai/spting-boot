package com.wangzs.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //ע��������ǰUserFunctionService ��spring�����һ��Bean
public class UserFunctionService {
	@Autowired  //��functionService ��ʵ��ע�뵽 UserFunctionService��  ʹUserFunctionService �߱� FunctionService�Ĺ���
	FunctionService functionService;
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
