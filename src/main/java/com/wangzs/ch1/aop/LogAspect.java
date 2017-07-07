package com.wangzs.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // ע������һ������
@Component // �ô������ΪSpring���������Bean
public class LogAspect {
	@Pointcut("@annotation(com.wangzs.ch1.aop.Action)") // ע�������е�
	public void annotationPointCut() {
	};

	@After("annotationPointCut()") // ע������һ�����ԣ���ʹ��@PointCut�����е�
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("ע��ʽ����after  " + action.name()); // ������ע���ϵ����ԣ�Ȼ������־��¼��صĲ���
	}

	@Before("execution(* com.wangzs.ch1.aop.DemoMethodService.*(..))") // ����һ�����ԣ�ֱ��ʹ�����ع�����Ϊ����
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("ע��ʽ����before " + method.getName());
	}

}
