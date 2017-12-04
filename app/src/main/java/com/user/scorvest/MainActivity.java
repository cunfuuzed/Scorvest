package com.user.scorvest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements TrackerView.OnFragmentInteractionListener {

    private RecyclerView mRecyclerView;
    private Button mButton;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.trackNew);
        mRecyclerView = (RecyclerView) findViewById(R.id.watchList);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


    }

    public void trackNew(View view) {
        Intent intent = new Intent(this, TrackerCreator.class);

        startActivity(intent);
    }

    public void showTracker(View view) {
        Intent intent = new Intent(this, TrackerView.class);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
