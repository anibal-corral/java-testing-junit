package com.anibalcorral.javatests.util;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class DateUtil {

    public static boolean isLeapYear(int year){
        if(year %4!=0){
            return false;
        }

    return year % 100 != 0 || year % 400 == 0;

    }
}
