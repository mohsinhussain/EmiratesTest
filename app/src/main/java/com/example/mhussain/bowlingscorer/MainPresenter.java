package com.example.mhussain.bowlingscorer;

import android.content.Context;
import android.support.v7.app.AlertDialog;

import com.example.mhussain.bowlingscorer.Models.Ball;
import com.example.mhussain.bowlingscorer.Models.Frame;
import com.example.mhussain.bowlingscorer.Models.Score;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.hussain on 4/3/18.
 */


/**
 *
 *
 * I have not completed all the function. Needed more time to design the layout plus right the test cases too.
 *
 */


class MainPresenter implements Presenter {

    private final MainView view;
    private final DataService service;
    private final Context mContext;
    private List<Score> scoresList;

    public MainPresenter(Context mContext, MainView view, DataService service){
        this.view = view;
        this.service = service;
        this.mContext = mContext;
    }


    @Override
    public void showScore(List<Score> scoresList) {
        scoresList = service.updateScore(scoresList);
        view.updateScore(scoresList);
    }

    @Override
    public void throwBall(String playerName, int pinsDropped, boolean isSpare, boolean isStrike) {
        for(int i=0; i<scoresList.size();i++){
            if(scoresList.get(i).playerName.equalsIgnoreCase(playerName)){

                /** Following logic is incomplete
                 *
                 *
                 */
                //right logic for adding a ball
                Frame currentFrame = new Frame();
                int totaleFrames = scoresList.get(i).frames.size();
                if(totaleFrames!=0){
                    currentFrame = scoresList.get(i).frames.get(scoresList.get(i).frames.size()-1);
                }

                if(currentFrame.getBall1()==null) {
                    currentFrame.setBall1(new Ball(isStrike, isSpare, pinsDropped));
                }
                else if(!currentFrame.getBall1().isStrike()){
                    currentFrame.setBall2(new Ball(isStrike, isSpare, pinsDropped));
                }
                scoresList.get(i).frames.add(currentFrame);
            }
        }
    }

    @Override
    public int getCurrentFrameNumber(String playerName, List<Score> scoresList) {
        for(int i=0; i<scoresList.size();i++) {
            if (scoresList.get(i).playerName.equalsIgnoreCase(playerName)) {
                int totaleFrames = scoresList.get(i).frames.size();
                if(totaleFrames!=0){
                    return scoresList.get(i).frames.size()-1;
                }
                else{
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override
    public int scoreSoFar(String playerName) {
        for(int i=0; i<scoresList.size();i++) {
            if (scoresList.get(i).playerName.equalsIgnoreCase(playerName)) {
                int totaleFrames = scoresList.get(i).frames.size();
                if(totaleFrames!=0){
                    return scoresList.get(i).frames.get(scoresList.get(i).frames.size()-1).getTotalScore();
                }
                else{
                    return 0;
                }
            }
        }
        return 0;
    }



}
