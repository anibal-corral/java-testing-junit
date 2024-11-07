package com.anibalcorral.payments;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class PaymentRequest {
private double amount;


    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
