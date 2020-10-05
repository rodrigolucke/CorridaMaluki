package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import get.GetGps;
import get.GetGrid;

public class Grid extends AppCompatActivity {
    public static TextView textViewGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        textViewGrid = findViewById(R.id.textViewGrid);




        GetGrid getGrid = new GetGrid();
        getGrid.execute();
    }
}