package com.anibalcorral.javatests.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class PasswordUtilTest {

    @Test
    void weak_when_has_less_than_8_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("123"));

    }
    @Test
    void weak_when_has_only_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("abc"));
    }
    @Test
    void medium_when_has_letters_and_numbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM,PasswordUtil.assessPassword("abc1234a"));
    }
    @Test
    void strong_when_has_letters_numbers_and_simbols() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG,PasswordUtil.assessPassword("abc1234a##$"));
    }
}