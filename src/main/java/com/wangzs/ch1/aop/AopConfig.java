package com.wangzs.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wangzs.ch1.aop")
@EnableAspectJAutoProxy	//注解开启spring对 AspectJ代理的支持
public class AopConfig {
}
