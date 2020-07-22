package com.example.UbuntYou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class primeiratela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiratela);
    }
    public void proximaTela(View view){

        Intent intent = new Intent(this, segundaactivity.class);
        startActivity(intent);
