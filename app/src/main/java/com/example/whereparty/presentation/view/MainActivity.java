package com.example.whereparty.presentation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.whereparty.Injection;
import com.example.whereparty.R;
import com.example.whereparty.presentation.controller.MainController;
import com.example.whereparty.presentation.model.concertAPI.Event;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new MainController(Injection.getSharedPreferences(getApplicationContext()),
                Injection.getGson(), this
        );
        controller.onStart();
    }

    public void showList(List<Event> eventList) {
        RecyclerView recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // define an adapter
        ListAdapter mAdapter = new ListAdapter(eventList, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Event item, String typeDetail) {
                controller.onRecyclerViewClick(item, typeDetail);
            }
        });
        recyclerView.setAdapter(mAdapter);
    }

    public void showError() {
        Toast.makeText(this, "No data in cache", Toast.LENGTH_SHORT).show();
    }

    public void navigateToDetails(Event event, String typeDetail) {
        Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);

        myIntent.putExtra("eventKey", Injection.getGson().toJson(event));
        myIntent.putExtra("typeDetailKey", typeDetail);
        MainActivity.this.startActivity(myIntent);
    }
}
