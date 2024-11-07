package com.anibalcorral.player;

import java.util.Random;

/**
 * @author Aníbal Corral (anibal.corral@gmail.com)
 */
public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){

        return new Random().nextInt(sides)+1;
    }

}
