package com.wangzs.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton") //������Ĭ�ϵ� һ��Spring������ֻ��һ��Bean
public class DemoSingletonService {

}
