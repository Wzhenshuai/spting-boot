package com.wangzs.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //每次调用都新建一个bean
public class DemoPrototypeService {

}
