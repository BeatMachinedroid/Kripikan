package com.example.kripikan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.kripikan.R;

public class ProductActivity extends AppCompatActivity {


    TextView Tusername;

    String name ;
    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        session = new Session(ProductActivity.this);

        Tusername = findViewById(R.id.usernamep);
        name = session.getUserDetail().get("username");
        Tusername.setText(name);


    }


    public void Home(View view) {
        Intent Intent = new Intent(ProductActivity.this, ProductActivity.class);
        startActivity(Intent);
    }

    public void Cart(View view) {
        Intent Intent = new Intent(ProductActivity.this, PesananActivity.class);
        startActivity(Intent);
    }

    public void List(View view) {
        Intent Intent = new Intent(ProductActivity.this, ListActivity.class);
        startActivity(Intent);
    }

    public void Akun(View view) {
        Intent Intent = new Intent(ProductActivity.this, ProfilActivity.class);
        startActivity(Intent);
    }

    public void Beli1(View view) {
        Intent Intent = new Intent(ProductActivity.this, cartActivity.class);
        startActivity(Intent);
    }
    public void Beli2(View view) {
        Intent Intent = new Intent(ProductActivity.this, cartActivity.class);
        startActivity(Intent);
    }
    public void Beli3(View view) {
        Intent Intent = new Intent(ProductActivity.this, cartActivity.class);
        startActivity(Intent);
    }
    public void Beli4(View view) {
        Intent Intent = new Intent(ProductActivity.this, cartActivity.class);
        startActivity(Intent);
    }


}