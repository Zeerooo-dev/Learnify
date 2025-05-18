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
import java.util.Random;
public class englishwelcomepage3 extends AppCompatActivity {
    TextView home, settings;
    Button eng_startbtn;
    public static boolean one = true;
    public static boolean two = true;
    public static boolean three = true;
    public static boolean four = true;
    public static boolean five = true;
    public static int num = 0;
    public static int eng_score = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.englishwelcomepage3);
        home = (TextView) findViewById(R.id.home);
        settings = (TextView) findViewById(R.id.settings);

        Random r  = new Random();
        int x = r.nextInt(5);

        eng_startbtn = (Button) findViewById(R.id.eng_startbtn);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(englishwelcomepage3.this, MainActivity.class));
            }
        });
        eng_startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(x){
                    case 0:
                        num++;
                        one = false;
                        startActivity(new Intent(englishwelcomepage3.this, english.class));
                        break;
                    case 1:
                        num++;
                        two = false;
                        startActivity(new Intent(englishwelcomepage3.this, english2.class));
                        break;
                    case 2:
                        num++;
                        three = false;
                        startActivity(new Intent(englishwelcomepage3.this, english3.class));
                        break;
                    case 3:
                        num++;
                        four = false;
                        startActivity(new Intent(englishwelcomepage3.this, english4.class));
                        break;
                    case 4:
                        num++;
                        five = false;
                        startActivity(new Intent(englishwelcomepage3.this, english5.class));
                        break;
                }

            }
        });

    }
}
