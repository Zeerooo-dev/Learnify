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

import java.util.Random;

public class english5 extends AppCompatActivity {
    TextView question, choice1,choice2, choice3, choice4, q_text, eng_next5, eng_back4;
    TextView home, settings;
    boolean answered = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.english5);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        question = (TextView) findViewById(R.id.question);
        choice1 = (TextView) findViewById(R.id.choice1);
        choice2 = (TextView) findViewById(R.id.choice2);
        choice3 = (TextView) findViewById(R.id.choice3);
        choice4 = (TextView) findViewById(R.id.choice4);
        q_text = (TextView) findViewById(R.id.q_text);
        eng_next5 = (TextView) findViewById(R.id.eng_next5);
        eng_back4 = (TextView) findViewById(R.id.eng_back4);
        Random r  = new Random();
        englishwelcomepage3.five = true;
        int x = r.nextInt(4);
        if(englishwelcomepage3.num == 1){
            eng_back4.setVisibility(View.INVISIBLE);
            eng_back4.setClickable(false);
        }
        if(englishwelcomepage3.num == 5){
            eng_next5.setText("FINISH");
        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(english5.this, main.class));
            }

        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(english5.this, MainActivity.class));
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
                choice4.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice1.setBackground(getResources().getDrawable(R.drawable.ansgray));
                choice2.setBackground(getResources().getDrawable(R.drawable.anscorrect));
                choice3.setBackground(getResources().getDrawable(R.drawable.ansgray));

                choice2.setTextColor(getResources().getColor(R.color.black));
                choice3.setTextColor(getResources().getColor(R.color.white));
                choice4.setTextColor(getResources().getColor(R.color.white));
                q_text.setText("Correct!");
                englishwelcomepage3.eng_score++;


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
        eng_back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                englishwelcomepage3.num--;
                englishwelcomepage3.five = true;
                finish();
            }
        });

        eng_next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(englishwelcomepage3.num == 5){
                    startActivity(new Intent(english5.this, englishscore.class));
                }
                else{
                    if(x == 0 && englishwelcomepage3.one){
                        englishwelcomepage3.num++;
                        englishwelcomepage3.one = false;
                        startActivity(new Intent(english5.this, english.class));
                    }
                    else if(x == 1 && englishwelcomepage3.two){
                        englishwelcomepage3.num++;
                        englishwelcomepage3.two = false;
                        startActivity(new Intent(english5.this, english2.class));
                    }
                    else if(x == 2 && englishwelcomepage3.three){
                        englishwelcomepage3.num++;
                        englishwelcomepage3.three = false;
                        startActivity(new Intent(english5.this, english3.class));
                    }
                    else if(x == 3 && englishwelcomepage3.four){
                        englishwelcomepage3.num++;
                        englishwelcomepage3.four = false;
                        startActivity(new Intent(english5.this, english4.class));
                    }

                }
            }
        });








    }
}