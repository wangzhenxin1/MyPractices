package com.xiao.utils;

/**
 * @Description 工具类
 * @Auther: 笑笑
 * @Date: 11:12 2018/9/8
 */
public class Tools {

    /**
     * @Description 判断一个字符串是否不为空(null,"null","")
     * @Date 11:15 2018/9/8
     * @Param
     * @return
     */
    public static boolean notEmpty(String s){
        return s != null && !s.equals("") && !s.equals("null");
    }
}
