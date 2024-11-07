package com.anibalcorral.payments;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class PaymentProcessorTest {

    @Test
    public void payment_is_correct(){
        PaymentGateway pg = Mockito.mock(PaymentGateway.class);
        Mockito.when(pg.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor pp = new PaymentProcessor(pg);
        assertTrue(pp.makePayment(1000));
    }
    @Test
    public void payment_is_incorrect(){
        PaymentGateway pg = Mockito.mock(PaymentGateway.class);
        Mockito.when(pg.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor pp = new PaymentProcessor(pg);
        assertFalse(pp.makePayment(1000));
    }
}