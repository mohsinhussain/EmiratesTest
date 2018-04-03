package com.example.mhussain.bowlingscorer;

import com.example.mhussain.bowlingscorer.Models.Score;

import java.util.List;

/**
 * Created by m.hussain on 4/3/18.
 */

interface Presenter {
    void showScore(List<Score> scoresList);

    void throwBall(String playerName, int pinsDropped, boolean isSpare, boolean isStrike);

    int getCurrentFrameNumber(String playerName, List<Score> scoresList);

    int scoreSoFar(String playerName);
}
