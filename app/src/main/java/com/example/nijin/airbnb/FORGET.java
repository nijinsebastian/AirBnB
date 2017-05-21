package com.example.nijin.airbnb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class FORGET extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);

        ImageButton tv4 = (ImageButton) findViewById(R.id.imageButton5);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FORGET.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton tv3 = (ImageButton) findViewById(R.id.imageButton6);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FORGET.this,MainActivity.class);
                startActivity(i);
            }
    });
}}


