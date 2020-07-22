package com.example.UbuntYou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quartaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiractivity);
    }

    public void proximaTela3(View view) {

        Intent intent = new Intent(this, quartactivity.class);
        startActivity(intent);
    }
}
