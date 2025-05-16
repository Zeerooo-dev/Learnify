package com.example.try2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class science extends AppCompatActivity {
    TextView question, choice1,choice2, choice3, choice4, q_text, sci_next1;
    TextView home, settings;
    public static int sci_score = 0;
    boolean answered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.science);
        science.sci_score = 0;
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        question = (TextView) findViewById(R.id.question);
        choice1 = (TextView) findViewById(R.id.choice1);
        choice2 = (TextView) findViewById(R.id.choice2);
        choice3 = (TextView) findViewById(R.id.choice3);
        choice4 = (TextView) findViewById(R.id.choice4);
        q_text = (TextView) findViewById(R.id.q_text);
        sci_next1 = (TextView) findViewById(R.id.sci_next1);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(science.this, main.class));
            }

        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(science.this, MainActivity.class));
            }
        });



    choice1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answered) return;
            answered = true;
            choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice1.setBackground(getResources().getDrawable(R.drawable.answrong));
            choice2.setBackground(getResources().getDrawable(R.drawable.anscorrect));
            choice3.setBackground(getResources().getDrawable(R.drawable.ansgray));

            choice2.setTextColor(getResources().getColor(R.color.black));
            choice3.setTextColor(getResources().getColor(R.color.white));
            choice4.setTextColor(getResources().getColor(R.color.white));
            q_text.setText("Incorrect!");
        }
    });
    choice2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answered) return;
            answered = true;
            //Text Background
            choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice2.setBackground(getResources().getDrawable(R.drawable.anscorrect));
            choice3.setBackground(getResources().getDrawable(R.drawable.ansgray));

            //Text Color
            choice2.setTextColor(getResources().getColor(R.color.black));
            choice3.setTextColor(getResources().getColor(R.color.white));
            choice4.setTextColor(getResources().getColor(R.color.white));
            q_text.setText("Correct!");
            if (sci_score <= 1) {
                sci_score++;
            }

        }
    });
    choice3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answered) return;
            answered = true;
            choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice2.setBackground(getResources().getDrawable(R.drawable.anscorrect));
            choice3.setBackground(getResources().getDrawable(R.drawable.answrong));

            choice2.setTextColor(getResources().getColor(R.color.black));
            choice3.setTextColor(getResources().getColor(R.color.white));
            choice4.setTextColor(getResources().getColor(R.color.white));
            q_text.setText("Incorrect!");
        }
    });
    choice4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answered) return;
            answered = true;
            choice4.setBackground(getResources().getDrawable(R.drawable.answrong));
            choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
            choice2.setBackground(getResources().getDrawable(R.drawable.anscorrect));
            choice3.setBackground(getResources().getDrawable(R.drawable.ansgray));

            choice2.setTextColor(getResources().getColor(R.color.black));
            choice3.setTextColor(getResources().getColor(R.color.white));
            choice4.setTextColor(getResources().getColor(R.color.white));
            q_text.setText("Incorrect!");

        }
    });

    sci_next1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(science.this, science2.class));
        }
    });

    }
}