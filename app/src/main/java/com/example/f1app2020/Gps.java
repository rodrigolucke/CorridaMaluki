package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import get.GetEquipes;
import get.GetGps;

public class Gps extends AppCompatActivity {
    public static TextView textGps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
        textGps = findViewById(R.id.textViewGps);




        GetGps getGps = new GetGps();
        getGps.execute();
    }
}