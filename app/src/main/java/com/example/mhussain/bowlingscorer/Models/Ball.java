package com.example.mhussain.bowlingscorer.Models;

/**
 * Created by m.hussain on 4/3/18.
 */

public class Ball {
    boolean isStrike;
    boolean isSpare;
    int pinsDropped;

    public Ball(boolean isStrike, boolean isSpare, int pinsDropped){
        this.isStrike = isStrike;
        this.isSpare = isSpare;
        this.pinsDropped = pinsDropped;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public void setStrike(boolean strike) {
        isStrike = strike;
    }

    public boolean isSpare() {
        return isSpare;
    }

    public void setSpare(boolean spare) {
        isSpare = spare;
    }

    public int getPinsDropped() {
        return pinsDropped;
    }

    public void setPinsDropped(int pinsDropped) {
        this.pinsDropped = pinsDropped;
    }
}


