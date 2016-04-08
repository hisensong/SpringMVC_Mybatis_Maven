package com.ssmm.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

import org.apache.http.NameValuePair;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpTest {
	
	public static final String GET_URL = "http://localhost:8080/ssmm/user/showOneUser?id=4";
	public static final String POST_URL = "http://localhost:8080/ssmm/user/addUser";
	public static final String FORM_POST_URL = "http://localhost:8080/myDemo/Ajax/serivceJ.action";
	
	/** 
     * 妯℃嫙鍙戦� get璇锋眰 
     */ 
	@Test
    public void get() {  
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        try {  
            // 鍒涘缓httpget.    
            HttpGet httpget = new HttpGet(GET_URL);  
            System.out.println("executing request " + httpget.getURI());  
            // 鎵цget璇锋眰.    
            CloseableHttpResponse response = httpclient.execute(httpget);  
            try {  
                // 鑾峰彇鍝嶅簲瀹炰綋    
                HttpEntity entity = response.getEntity();  
                System.out.println("--------------------------------------");  
                // 鎵撳嵃鍝嶅簲鐘舵�    
                System.out.println(response.getStatusLine());  
                if (entity != null) {  
                    // 鎵撳嵃鍝嶅簲鍐呭闀垮害    
                    System.out.println("Response content length: " + entity.getContentLength());  
                    // 鎵撳嵃鍝嶅簲鍐呭    
                    System.out.println("Response content: " + EntityUtils.toString(entity));  
                }  
                System.out.println("------------------------------------");  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (ParseException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            // 鍏抽棴杩炴帴,閲婃斁璧勬簮    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    } 
	
	/** 
	 * ajax post璇锋眰
     * 鍙戦� post璇锋眰璁块棶鏈湴搴旂敤骞舵牴鎹紶閫掑弬鏁颁笉鍚岃繑鍥炰笉鍚岀粨鏋�
     */ 
	@Test
    public void post() {  
        // 鍒涘缓榛樿鐨刪ttpClient瀹炰緥.    
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        // 鍒涘缓httppost    
        HttpPost httppost = new HttpPost(POST_URL);  
        // 鍒涘缓鍙傛暟闃熷垪    
        List<NameValuePair> formparams = new ArrayList<NameValuePair>(); 
        formparams.add(new BasicNameValuePair("username", "国美管理员")); 
        formparams.add(new BasicNameValuePair("password", "098765"));
        formparams.add(new BasicNameValuePair("age", "67"));
        UrlEncodedFormEntity uefEntity;  
        try {  
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
            httppost.setEntity(uefEntity);  
            System.out.println("executing request " + httppost.getURI());  
            CloseableHttpResponse response = httpclient.execute(httppost);  
            try {  
                HttpEntity entity = response.getEntity();  
                if (entity != null) {  
                    System.out.println("--------------------------------------");  
                    System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));  
                    System.out.println("--------------------------------------");  
                }  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e1) {  
            e1.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            // 鍏抽棴杩炴帴,閲婃斁璧勬簮    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
	
	
	/** 
     * post鏂瑰紡鎻愪氦琛ㄥ崟锛堟ā鎷熺敤鎴风櫥褰曡姹傦級 
     */
	@Test
    public void postForm() {  
        // 鍒涘缓榛樿鐨刪ttpClient瀹炰緥.    
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        // 鍒涘缓httppost    
        HttpPost httppost = new HttpPost(FORM_POST_URL);  
        // 鍒涘缓鍙傛暟闃熷垪    
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();  
        formparams.add(new BasicNameValuePair("username", "admin"));  
        formparams.add(new BasicNameValuePair("password", "123456"));  
        UrlEncodedFormEntity uefEntity;  
        try {  
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");  
            httppost.setEntity(uefEntity);  
            System.out.println("executing request " + httppost.getURI());  
            CloseableHttpResponse response = httpclient.execute(httppost);  
            try {  
                HttpEntity entity = response.getEntity();  
                if (entity != null) {  
                    System.out.println("--------------------------------------");  
                    System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));  
                    System.out.println("--------------------------------------");  
                }  
            } finally {  
                response.close();  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e1) {  
            e1.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            // 鍏抽棴杩炴帴,閲婃斁璧勬簮    
            try {  
                httpclient.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
	
	

}
