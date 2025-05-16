package com.example.try2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class science4 extends AppCompatActivity {
    TextView question, choice1,choice2, choice3, choice4, q_text, sci_next4, sci_back3;
    TextView home, settings;
    boolean answered = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.science4);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        question = (TextView) findViewById(R.id.question);
        choice1 = (TextView) findViewById(R.id.choice1);
        choice2 = (TextView) findViewById(R.id.choice2);
        choice3 = (TextView) findViewById(R.id.choice3);
        choice4 = (TextView) findViewById(R.id.choice4);
        q_text = (TextView) findViewById(R.id.q_text);
        sci_next4 = (TextView) findViewById(R.id.sci_next4);
        sci_back3 = (TextView) findViewById(R.id.sci_back3);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(science4.this, main.class));
            }

        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(science4.this, MainActivity.class));
            }
        });



        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered) return;
                answered = true;
                choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice1.setBackground(getResources().getDrawable(R.drawable.answrong));
                choice2.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice3.setBackground(getResources().getDrawable(R.drawable.anscorrect));

                choice2.setTextColor(getResources().getColor(R.color.white));
                choice3.setTextColor(getResources().getColor(R.color.black));
                choice4.setTextColor(getResources().getColor(R.color.white));
                q_text.setText("Incorrect!");
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered) return;
                answered = true;
                choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice2.setBackground(getResources().getDrawable(R.drawable.answrong));
                choice3.setBackground(getResources().getDrawable(R.drawable.anscorrect));

                choice2.setTextColor(getResources().getColor(R.color.white));
                choice3.setTextColor(getResources().getColor(R.color.black));
                choice4.setTextColor(getResources().getColor(R.color.white));
                q_text.setText("Incorrect!");

            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered) return;
                answered = true;
                choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice2.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice3.setBackground(getResources().getDrawable(R.drawable.anscorrect));

                choice2.setTextColor(getResources().getColor(R.color.white));
                choice3.setTextColor(getResources().getColor(R.color.black));
                choice4.setTextColor(getResources().getColor(R.color.white));
                q_text.setText("Correct!");
                if (science.sci_score <= 4){
                    science.sci_score++;

                }
            }
        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered) return;
                answered = true;
                choice4.setBackground(getResources().getDrawable(R.drawable.answrong));
                choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice2.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice3.setBackground(getResources().getDrawable(R.drawable.anscorrect));

                choice2.setTextColor(getResources().getColor(R.color.white));
                choice3.setTextColor(getResources().getColor(R.color.black));
                choice4.setTextColor(getResources().getColor(R.color.white));
                q_text.setText("Incorrect!");

            }
        });
        sci_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        sci_next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(science4.this, science5.class));
            }
        });








    }
}