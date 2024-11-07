package com.anibalcorral.javatests.util;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("Hola",3);

        System.out.println(result);
        if(result.equals("HolaHolaHola")){
            System.out.println("OK");
        }

    }

}