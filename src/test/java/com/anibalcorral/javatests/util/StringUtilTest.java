package com.anibalcorral.javatests.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */

class StringUtilTest {
    @Test
   //nombre del test que estoy haciendo
   public void repeat_string_once() {
       Assertions.assertEquals("Hola",StringUtil.repeat("Hola", 1));
   }

    @Test
    //nombre del test que estoy haciendo
    public void repeat_string_multiple_times() {
        Assertions.assertEquals( "HolaHolaHola",StringUtil.repeat("Hola", 3));
    }
    @Test
    //nombre del test que estoy haciendo
    public void repeat_string_zero_times() {
        Assertions.assertEquals("",StringUtil.repeat("Hola", 0));

    }
    @Test()
    //nombre del test que estoy haciendo
    public void repeat_string_negative_times() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            StringUtil.repeat("Hola", -1);
        });

    }
}