package com.ssmm.api;

/** 
 * ����ӿ�  
 */  
public interface ISayHelloService {  
  
    /** 
     * @param name 
     * @return 
     */  
     String doSayHello(String name);  
       
    /** 
     * @param name 
     * @param welcomeStr 
     * @return 
     */  
     String doSayHello(String name, String welcomeStr);  
} 
