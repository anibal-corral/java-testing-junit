package com.anibalcorral.discounts;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class PriceCalculatorTest {
PriceCalculator pc;
    @BeforeEach
    void setup(){
        pc=new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_not_prices(){
        //PriceCalculator pc = new PriceCalculator();
        assertThat(pc.getTotal(),is(0.0));

    }
    @Test
    public void total_is_the_sum_of_prices(){
        //PriceCalculator pc = new PriceCalculator();
        pc.addPrice(10.5);
        pc.addPrice(9.5);
        assertThat(pc.getTotal(),is(20.0));

    }
    @Test
    public void apply_discount_to_prices(){
        pc.addPrice(9.1);
        pc.addPrice(3.5);
        pc.setDiscount(10);
        assertThat(pc.getTotal(),is(11.34));

    }

}