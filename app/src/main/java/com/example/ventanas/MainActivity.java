package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vent2(View view){
        Intent i = new Intent(MainActivity.this, Ventana2.class);
        startActivity(i);
    }
    public void vent3(View view){
        Intent i = new Intent(MainActivity.this, Ventana3.class);
        startActivity(i);
    }
    public void vent4(View view){
        Intent i = new Intent(MainActivity.this, Ventana4.class);
        startActivity(i);
    }
}