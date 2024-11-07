package com.anibalcorral.discounts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result =0.0;
        for (Double price : prices) {
            result+=price;
        }

        return result-( result*(discount/100));
    }
    public void addPrice(double price){
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
