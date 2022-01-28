package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (TextView) findViewById(R.id.name);
        password = (TextView) findViewById(R.id.password);

        String username=getIntent().getStringExtra("name");
        String pass=getIntent().getStringExtra("password");

        name.setText("Username: "+ username);
        password.setText("Password: "+ pass);
    }
}