package com.example.mhussain.bowlingscorer;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mhussain.bowlingscorer.Models.Score;

import java.util.List;

/**
 * Created by m.hussain on 4/3/18.
 */

public class ScoresAdapter extends RecyclerView.Adapter<ScoresAdapter.MyViewHolder> {

    private List<Score> scoresList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView playerName;

        public MyViewHolder(View view) {
            super(view);
            playerName = (TextView) view.findViewById(R.id.playerName);
        }
    }


    public ScoresAdapter(List<Score> scoresList) {
        this.scoresList = scoresList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.score_card_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Score score = scoresList.get(position);
        holder.playerName.setText(score.playerName);
    }

    @Override
    public int getItemCount() {
        return scoresList.size();
    }
}