package com.example.try2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextEmailAddress, editTextPassword;
    Button login_btn;
    TextView testbtn;

    String user_pass = "admin123";
    String user_email = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        login_btn = (Button) findViewById(R.id.login_btn);
        testbtn = (TextView) findViewById(R.id.testbtn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTextEmailAddress.getText().toString().isEmpty()){
                    editTextTextEmailAddress.setError("This field cannot be empty");

                }if (editTextPassword.getText().toString().isEmpty()) {
                    editTextPassword.setError("This field cannot be empty");

                    }else {
                        if(editTextTextEmailAddress.getText().toString().equals(user_email)&&editTextPassword.getText().toString().equals(user_pass)){
                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(MainActivity.this, main.class));
                        }else {
                            editTextTextEmailAddress.setError("Incorrect Password");
                            editTextPassword.setError("Incorrect Password");
                            Toast.makeText(MainActivity.this, "Username or Password is Incorrect", Toast.LENGTH_SHORT).show();

                        }

                }
            }
        });
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, main.class));
            }
        });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}