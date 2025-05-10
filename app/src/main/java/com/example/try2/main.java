package com.example.try2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class main extends AppCompatActivity {
    Button l_science, l_math, l_english;
    public static String text;
    TextView home, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        l_english= (Button) findViewById(R.id.l_english);
        l_math = (Button) findViewById(R.id.l_math);
        l_science = (Button) findViewById(R.id.l_science);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        l_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main.this, welcomepage.class));
                text = "Science";
            }
        });
        l_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main.this, welcomepage.class));
                text = "Math";
            }
        });
        l_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main.this, welcomepage.class));
                text = "English";
            }
        });
    }
}