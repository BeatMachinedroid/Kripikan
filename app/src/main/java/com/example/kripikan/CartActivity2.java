package com.example.kripikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kripikan.R;

public class CartActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart2);
    }

    public void Cart2(View view) {

            Intent Intent = new Intent(CartActivity2.this, SelesaiActivity.class);
            startActivity(Intent);

    }
}