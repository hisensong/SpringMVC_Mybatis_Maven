package com.ssmm.common;


import java.util.Collection;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * 鍩虹鏍￠獙绫�
 * @author HisenSong
 *
 */
public class SsmmAssert {

	public SsmmAssert() {
		
	}

    public static void isTrue(boolean expression,String code, String message) {
        if(!expression) {
            throw new SsmmException(code,message);
        }
    }

    public static void notTrue(boolean expression,String code, String message) {
        if(expression) {
            throw new SsmmException(code,message);
        }
    }

    public static void isNull(Object object,String code, String message) {
        if(object != null) {
            throw new SsmmException(code,message);
        }
    }

    public static void notNull(Object object,String code, String message) {
        if(object == null) {
            throw new SsmmException(code,message);
        }
    }

    public static void hasLength(String text,String code, String message) {
        if(!StringUtils.hasLength(text)) {
            throw new SsmmException(code,message);
        }
    }

    public static void hasText(String text,String code, String message) {
        if(!StringUtils.hasText(text)) {
            throw new SsmmException(code,message);
        }
    }

    public static void notEmpty(Object[] array,String code, String message) {
        if(ObjectUtils.isEmpty(array)) {
            throw new SsmmException(code,message);
        }
    }

    public static void notEmpty(Collection<?> collection,String code, String message) {
        if(CollectionUtils.isEmpty(collection)) {
            throw new SsmmException(code,message);
        }
    }

    public static void notEmpty(Map<?, ?> map,String code, String message) {
        if(CollectionUtils.isEmpty(map)) {
            throw new SsmmException(code,message);
        }
    }
}
