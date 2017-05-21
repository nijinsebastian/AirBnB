package com.example.nijin.airbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        this.getSupportActionBar().hide();
        ImageButton tv4 = (ImageButton) findViewById(R.id.imageButton);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(name.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton tv3 = (ImageButton) findViewById(R.id.imageButton2);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(name.this,email.class);
                startActivity(i);
            }
    });
}}
