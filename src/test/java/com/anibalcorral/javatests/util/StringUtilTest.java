package com.anibalcorral.javatests.util;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("Hola",3), "HolaHolaHola");
        System.out.println(StringUtil.repeat("Hola",3));
        if(!StringUtil.repeat("Hola",3).equals("HolaHolaHola")){
            throw new RuntimeException("ERROR");
        }


    }
    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }

}