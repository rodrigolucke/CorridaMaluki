package com.example.f1app2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;
import get.GetEquipes;

public class Equipes extends AppCompatActivity {

    public static TextView textEquipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipes);
        textEquipe = findViewById(R.id.textViewEquipe);


                GetEquipes getequipe = new GetEquipes();
                getequipe.execute();
              String url = "http://192.168.0.16:44307/api/2/434562/equipes";



       /* BuscarAsync buscarTemporadas = new BuscarAsync(this);
        buscarTemporadas.execute();*/
    }


}