package com.ssmm.api.impl;

import com.ssmm.api.ISayHelloService;

/** 
 * ����ӿ�ʵ��  
 */  
public class DefaultSayHelloServiceImpl implements ISayHelloService {  
  
    public String doSayHello(String name) {  
        return doSayHello(name, "hello");  
    }  
  
    public String doSayHello(String name, String welcomeStr) {  
        return name + "," + welcomeStr;  
    }  
}  
