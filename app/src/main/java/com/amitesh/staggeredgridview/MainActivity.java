package com.amitesh.staggeredgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person one", "Person two", "Person three", "Person four", "Person five", "Person siz", "Person 7", "Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,
            R.drawable.five, R.drawable.siz, R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,
            R.drawable.five, R.drawable.siz, R.drawable.one, R.drawable.two));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(this, personNames, personImages);
        recyclerView.setAdapter(customAdapter);
    }
}
