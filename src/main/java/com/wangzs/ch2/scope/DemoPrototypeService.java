package com.wangzs.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //ÿ�ε��ö��½�һ��bean
public class DemoPrototypeService {

}
