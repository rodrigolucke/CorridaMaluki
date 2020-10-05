package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import get.GetEquipes;
import get.GetPilotos;

public class Pilotos extends AppCompatActivity {
    public static TextView textViewPilotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilotos);


        setContentView(R.layout.activity_pilotos);
        textViewPilotos = findViewById(R.id.textViewPilotos);
                GetPilotos getPilotos = new GetPilotos();
                getPilotos.execute();



    }
}