package com.anibalcorral.player;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low(){
        /** Si ejecuto esto, algunas veces voy a tener error y otras va a pasar
         * para ello es que debo ocupar Mockito, para simular el resultado de la calse
        Dice dice = new Dice(6);
        Player p = new Player(dice, 3);
        assertEquals(false,p.play());
         */
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player p = new Player(dice, 3);
        assertFalse(p.play());
}
    @Test
    public void wins_when_dice_number_is_too_big(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player p = new Player(dice, 3);
        assertTrue(p.play());


    }
}