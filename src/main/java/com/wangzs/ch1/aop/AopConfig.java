package com.wangzs.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wangzs.ch1.aop")
@EnableAspectJAutoProxy	//ע�⿪��spring�� AspectJ�����֧��
public class AopConfig {
}
