package com.example.UbuntYou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactivity);
    }

    public void proximaTela1(View view) {
        Intent intent = new Intent(this, terceiraactivity.class);
        startActivity(intent);
    }
}
