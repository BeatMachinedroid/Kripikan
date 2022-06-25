package com.example.kripikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kripikan.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view) {
        Intent Intent = new Intent(LoginActivity.this, LogUserActivity.class);
        startActivity(Intent);
    }

    public void Sign(View view) {
        Intent Intent = new Intent(LoginActivity.this, SignActivity.class);
        startActivity(Intent);
    }
}