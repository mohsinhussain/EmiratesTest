package com.example.mhussain.bowlingscorer.Models;

/**
 * Created by m.hussain on 4/3/18.
 */

public class Frame {
    Ball ball1;
    Ball ball2;
    int totalScore;

    public Ball getBall1() {
        return ball1;
    }

    public void setBall1(Ball ball1) {
        this.ball1 = ball1;
    }

    public Ball getBall2() {
        return ball2;
    }

    public void setBall2(Ball ball2) {
        this.ball2 = ball2;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
