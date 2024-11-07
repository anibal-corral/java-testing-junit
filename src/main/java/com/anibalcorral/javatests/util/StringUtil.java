package com.anibalcorral.javatests.util;


import java.util.Objects;

public class StringUtil {

    public static String repeat(String str, int times){
        if(times<0) throw  new IllegalArgumentException("negative times are not allowed");
        String result ="";
        for (int i = 0; i < times; i++) {
            result+=str;
        }
        return result;

    }
    public static boolean isEmpty(String str){
        if(!Objects.nonNull(str)) return true;
        if(str.isBlank()) return true;
        if(str.isEmpty()) return true;
        return false;
    }
}
