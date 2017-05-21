package com.example.nijin.airbnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LOGINMAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmain);
        this.getSupportActionBar().hide();
        ImageButton tv1 = (ImageButton) findViewById(R.id.imageButton7);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LOGINMAIN.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton tv4 = (ImageButton) findViewById(R.id.imageButton8);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LOGINMAIN.this,FORGET.class);
                startActivity(i);
            }
        });
        ImageButton tv3 = (ImageButton) findViewById(R.id.imageButton9);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LOGINMAIN.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
