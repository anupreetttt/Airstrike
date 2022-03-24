package com.example.airstrike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlayGame extends AppCompatActivity {

    ViewOfGame viewOfGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewOfGame = new ViewOfGame(this);
        setContentView(viewOfGame);

    }
}