package com.anibalcorral.payments;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public boolean makePayment(double amount) {
        PaymentResponse pr = this.paymentGateway.requestPayment(new PaymentRequest(amount));
        return pr.getStatus() == PaymentResponse.PaymentStatus.OK;

    }
}
