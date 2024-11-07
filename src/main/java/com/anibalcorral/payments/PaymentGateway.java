package com.anibalcorral.payments;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
