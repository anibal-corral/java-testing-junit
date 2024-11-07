package com.anibalcorral.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class DateUtiLeapYearlTest {
/**
 * All years divisible by 400 area leap
 * All years dibisiblle by 100 but not by 400 are not leap years
 * All years divisible by 4 but not by 100 are leap years
 * All years not divisible by 4 are NOT leap years
 * */

    @Test
    void return_true_when_year_is_divisible_by_400() {

assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));
}

@Test
    void return_false_when_year_is_divisible_by_100_but_not_by_400(){
    assertThat(DateUtil.isLeapYear(1700), is(false));
    assertThat(DateUtil.isLeapYear(1800), is(false));
    assertThat(DateUtil.isLeapYear(1900), is(false));
}
    @Test
    void return_true_when_year_is_divisible_by_4_but_not_by_100(){
        assertThat(DateUtil.isLeapYear(1996), is(true));
        assertThat(DateUtil.isLeapYear(2004), is(true));
        assertThat(DateUtil.isLeapYear(2008), is(true));
    }
    @Test
    void return_true_when_year_is_not_divisible_by_4(){
        assertThat(DateUtil.isLeapYear(2017), is(false));
        assertThat(DateUtil.isLeapYear(2018), is(false));
        assertThat(DateUtil.isLeapYear(2019), is(false));
    }

}