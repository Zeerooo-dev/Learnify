package com.example.try2;

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

public class sciencescore extends AppCompatActivity {
        TextView settings, home;
        TextView final_score, score_comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sciencescore);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sciencescore.this, main.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sciencescore.this, MainActivity.class));
            }
        });

        final_score = (TextView) findViewById(R.id.final_score);
        score_comment = (TextView) findViewById(R.id.score_comment);

        final_score.setText(String.valueOf(science.sci_score + "/5"));

        if (science.sci_score == 5){
            score_comment.setText("Perfect! Too Ez 😁");
        }else if(science.sci_score == 4){
            score_comment.setText("One more and it's perfect 😄");
        }else if(science.sci_score == 3){
            score_comment.setText("Not Bad! You’re getting there 😲");
        }else if(science.sci_score == 2){
            score_comment.setText("You’re Learning. Try again and Improve 🫤");
        }else if(science.sci_score == 1){
            score_comment.setText("Keep Going! But you MIGHT be dumb 😞");
        }else if(science.sci_score == 0){
            score_comment.setText("💀💀💀💀💀");
        }



    }
}