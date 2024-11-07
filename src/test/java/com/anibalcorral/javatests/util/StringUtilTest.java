package com.anibalcorral.javatests.util;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Objects;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */

class StringUtilTest {
    @Test
   //nombre del test que estoy haciendo
   public void repeat_string_once() {
       assertEquals("Hola",StringUtil.repeat("Hola", 1));
   }

    @Test
    //nombre del test que estoy haciendo
    public void repeat_string_multiple_times() {
        assertEquals( "HolaHolaHola",StringUtil.repeat("Hola", 3));
    }
    @Test
    //nombre del test que estoy haciendo
    public void repeat_string_zero_times() {
        assertEquals("",StringUtil.repeat("Hola", 0));
}
    @Test()
    //nombre del test que estoy haciendo
    public void repeat_string_negative_times() {
        assertThrows(IllegalArgumentException.class, ()->{
            StringUtil.repeat("Hola", -1);
        });

    }

    @Test
    void string_not_empty() {
        String s ="No Vacío";
        boolean result = StringUtil.isEmpty(s);
        assertFalse(result);
    }
    @Test
    void string_empty() {
        String s ="";
        boolean result = StringUtil.isEmpty(s);
        assertTrue(result);
    }
    @Test
    void string_is_empty_when_null() {
        String s =null;
        boolean result = StringUtil.isEmpty(s);
        assertTrue(result);
    }
    @Test
    void string_is_empty_when_has_only_spaces() {
        String s ="    ";
        boolean result = StringUtil.isEmpty(s);
        assertTrue(result);

    }
}