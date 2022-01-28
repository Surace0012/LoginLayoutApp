package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    MaterialButton loginbtn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username  = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pass);
        loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }

    public void sendData(){
        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("admin")&& pass.equals("12345")){
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("password",pass);
        startActivity(intent);
        Toast.makeText(MainActivity.this,"Redirecting", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Invalid Username password pair.", Toast.LENGTH_LONG).show();
        }
    }
}