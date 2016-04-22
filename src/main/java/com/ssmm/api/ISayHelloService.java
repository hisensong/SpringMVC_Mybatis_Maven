package com.ssmm.api;

/** 
 * 服务接口  
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
