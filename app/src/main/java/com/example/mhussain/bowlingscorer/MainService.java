package com.example.mhussain.bowlingscorer;

import android.content.Context;

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

class MainService implements DataService{

    Context mContext;

    public MainService(Context context) {
        this.mContext = context;
    }

    @Override
    public List<Score> updateScore(List<Score> scoresList) {
        scoresList.add(new Score("Alan", null));
        return scoresList;
    }
}
