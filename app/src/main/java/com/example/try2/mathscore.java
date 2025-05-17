package com.example.try2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mathscore extends AppCompatActivity {
    TextView settings, home;
    TextView mthfinal_score, mthscore_comment;

    ImageView homeicon, usericon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.mathscore);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

//        homeicon = (ImageView) findViewById(R.id.homeicon);
//        usericon = (ImageView) findViewById(R.id.usericon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mathscore.this, main.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mathscore.this, MainActivity.class));
            }
        });

        homeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mathscore.this, main.class));
            }
        });

        mthfinal_score = (TextView) findViewById(R.id.mthfinal_score);
        mthscore_comment = (TextView) findViewById(R.id.mthscore_comment);

        mthfinal_score.setText(String.valueOf(math.mth_score + " / 5"));

        if (math.mth_score == 5){
            mthscore_comment.setText("Perfect! Too Ez 😁");
        }else if(math.mth_score == 4){
            mthscore_comment.setText("One more and it's perfect 😄");
        }else if(math.mth_score == 3){
            mthscore_comment.setText("Not Bad! You’re getting there 😲");
        }else if(math.mth_score == 2){
            mthscore_comment.setText("You’re Learning. Try again and Improve 🫤");
        }else if(math.mth_score == 1){
            mthscore_comment.setText("Keep Going! But you MIGHT be dumb 😞");
        }else if(math.mth_score == 0){
            mthscore_comment.setText("💀💀💀💀💀");
        }



    }
}