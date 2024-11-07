package com.anibalcorral.fizz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class FizzBuzzTest {

    @Test
    void return_fizz_when_number_is_divisible_by_3(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }
    @Test
    void return_buzz_when_number_is_divisible_by_5(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
    @Test
    void return_fizzbuzz_when_number_is_divisible_by_3_and_5(){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
    @Test
    void return_input_number_when_number_isnot_divisible_by_3_and_5(){
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
}