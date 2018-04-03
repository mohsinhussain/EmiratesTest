package com.example.mhussain.bowlingscorer;

import com.example.mhussain.bowlingscorer.Models.Score;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.hussain on 4/3/18.
 */

interface DataService {
    List<Score> updateScore(List<Score> scoresList);
}
