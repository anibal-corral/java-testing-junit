package com.anibalcorral.javatests.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */

class StringUtilTest {
   @Test
    public void testRepeat(){
        Assertions.assertEquals(StringUtil.repeat("Holaa", 3), "HolaHolaHola");
        Assertions.assertEquals(StringUtil.repeat("Hola", 1), "Hola");
    }
}