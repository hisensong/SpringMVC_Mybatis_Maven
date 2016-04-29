package com.ssmm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StringUtils {

	public static void main(String[] args) {
		String str = StringUtils.file2String("E:/gitlab/springmvc_spring_mybatis_git/springmvc_spring_mybatis_maven/src/main/resources/temp/result.json");
		System.out.println("str==="+str);
	}
	
	public static String file2String(String filePath) {
		String str;
		byte[] strBuffer = null;
		int    flen = 0;
		File file = new File(filePath);  
		 try {
			InputStream in = new FileInputStream(file);
			flen = (int)file.length();
			strBuffer = new byte[flen];
			in.read(strBuffer, 0, flen);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 str = new  String(strBuffer);      //构建String时，可用byte[]类型，
	 
		return str;
	}

}
