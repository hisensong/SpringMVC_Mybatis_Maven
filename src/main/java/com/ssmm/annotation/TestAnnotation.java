package com.ssmm.annotation;

import java.util.List;

/**
 * Description: 
 * Author: HisenSong
 * Datetime: 2016年5月20日 下午3:11:12
 */
public class TestAnnotation {
	 
	public static void main(String[] args){
		 Parent c = new Child();
		 List<SortableField> list = c.init();
		 for(SortableField l:list){
			 System.out.println("字段名称："+l.getName()
					 + "\t字段类型："+l.getType()
					 + "\t注解名称："+l.getMeta().name()
					 +"\t注解描述："+l.getMeta().description());  
		 }
	}
}
