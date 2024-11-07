package com.anibalcorral.fizz;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class FizzBuzz {
public static String fizzBuzz(int number){
    if(number%5==0 && number%3==0) return "FizzBuzz";
    if(number%3==0) return "Fizz";
    if(number%5==0) return "Buzz";
    return Integer.toString(number);

}
}

