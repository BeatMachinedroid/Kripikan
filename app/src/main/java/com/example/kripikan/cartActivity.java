package com.example.kripikan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kripikan.R;

public class cartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    public void Cart1(View view) {

            Intent Intent = new Intent(cartActivity.this, CartActivity2.class);
            startActivity(Intent);

    }

    public void onClick(View view) {
    }


}