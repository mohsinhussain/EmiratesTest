package com.example.mhussain.bowlingscorer.Models;

import java.util.List;

/**
 * Created by m.hussain on 4/3/18.
 */

public class Score {
    public String playerName;
    public List<Frame> frames;

    public Score(String playerName, List<Frame> frames){
        this.playerName = playerName;
        this.frames = frames;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }
}
