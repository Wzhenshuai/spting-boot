package com.wangzs.ch1.aop;

import org.springframework.stereotype.Service;
//ʹ��ע��ı�������
@Service
public class DemoAnnotationService {
	@Action(name="ע��ʽ���ص� add ����")
	public void add(){}

}