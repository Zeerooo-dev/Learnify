package com.example.try2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class sciencewelcomepage2 extends AppCompatActivity {
    TextView home, settings;
    Button sci_startbtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sciencewelcomepage2);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        sci_startbtn = (Button) findViewById(R.id.sci_startbtn);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sciencewelcomepage2.this, MainActivity.class));
            }
        });
        sci_startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sciencewelcomepage2.this, science.class));
            }
        });

    }
}
