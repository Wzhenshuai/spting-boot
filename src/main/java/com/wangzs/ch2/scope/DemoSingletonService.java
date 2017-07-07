package com.wangzs.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton") //这里是默认的 一个Spring容器中只有一个Bean
public class DemoSingletonService {

}
