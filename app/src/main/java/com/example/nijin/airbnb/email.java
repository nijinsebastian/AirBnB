package com.example.nijin.airbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_email);
        this.getSupportActionBar().hide();

        ImageButton tv1 = (ImageButton) findViewById(R.id.imageButton3);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(email.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton tv2 = (ImageButton) findViewById(R.id.imageButton4);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(email.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
