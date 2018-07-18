package com.haoze.config;

/**
 * Created by hp on 2018/7/18.
 */
public class StringUtils {

    public static boolean isEmpty(String str) {

        if (null == str) {
            return true;
        }
        if ("".equals(str.trim())) {
            return true;
        }
        return false;
    }
}
