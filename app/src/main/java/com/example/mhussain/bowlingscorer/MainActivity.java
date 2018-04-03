package com.example.mhussain.bowlingscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mhussain.bowlingscorer.Models.Score;

import java.util.ArrayList;
import java.util.List;


/**
 *
 *
 * I have not completed all the function. Needed more time to design the layout plus right the test cases too.
 *
 */


public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recyclerView;
    private ScoresAdapter adapter;
    private List<Score> scoresList;
    private MainPresenter presenter;
    private MainService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        scoresList = new ArrayList<Score>();
        scoresList.add(new Score("Mohsin", null));
        adapter = new ScoresAdapter(scoresList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        service = new MainService(MainActivity.this);
        presenter = new MainPresenter(this, this, service);
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.showScore(scoresList);
    }

    @Override
    public void updateScore(List<Score> scoresList) {
        this.scoresList = scoresList;
        adapter.notifyDataSetChanged();
    }
}
