package com.anibalcorral.payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class PaymentProcessorTest {

private PaymentGateway pg;
private PaymentProcessor pp;
@BeforeEach
public void setup(){
     pg = Mockito.mock(PaymentGateway.class);
     pp = new PaymentProcessor(pg);

}
    /**
     * Partes de un test:
     * 1 - Preparación del Escenario: se preparan los objetos.
     * 2 - Llamada al metodo que quiero probar.
     * 3 - Comprobacion del resultado que estoy esperando.
     */
    @Test
    public void payment_is_correct(){
        //Se preparan los objetos que quiero usar en el test
        //PaymentGateway pg = Mockito.mock(PaymentGateway.class);
        Mockito.when(pg.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        //PaymentProcessor pp = new PaymentProcessor(pg);
        // Lo ququiero probar
        boolean result = pp.makePayment(1000);
        // Comprobación del resultado
        assertTrue(result);
    }
    @Test
    public void payment_is_incorrect(){
        //PaymentGateway pg = Mockito.mock(PaymentGateway.class);
        Mockito.when(pg.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        //PaymentProcessor pp = new PaymentProcessor(pg);
        assertFalse(pp.makePayment(1000));
    }
}