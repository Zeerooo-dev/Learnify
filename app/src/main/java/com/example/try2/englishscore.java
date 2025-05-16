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

public class englishscore extends AppCompatActivity {
    TextView settings, home;
    TextView engfinal_score, engscore_comment;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.englishscore);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(englishscore.this, main.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(englishscore.this, MainActivity.class));
            }
        });

        engfinal_score = (TextView) findViewById(R.id.engfinal_score);
        engscore_comment = (TextView) findViewById(R.id.engscore_comment);

        engfinal_score.setText(String.valueOf(english.eng_score + "/5"));

        if (english.eng_score == 5){
            engscore_comment.setText("Perfect! Too Ez 😁");
        }else if(english.eng_score == 4){
            engscore_comment.setText("One more and it's perfect 😄");
        }else if(english.eng_score == 3){
            engscore_comment.setText("Not Bad! You’re getting there 😲");
        }else if(english.eng_score == 2){
            engscore_comment.setText("You’re Learning. Try again and Improve 🫤");
        }else if(english.eng_score == 1){
            engscore_comment.setText("Keep Going! But you MIGHT be dumb 😞");
        }else if(english.eng_score== 0){
            engscore_comment.setText("💀💀💀💀💀");
        }



    }
}