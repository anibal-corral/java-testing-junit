package com.anibalcorral.payments;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class PaymentResponse {
enum PaymentStatus {
        OK, ERROR
    }
    private PaymentStatus status;
    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
