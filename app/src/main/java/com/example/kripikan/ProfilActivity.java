package com.example.kripikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.kripikan.R;

public class ProfilActivity<onClick> extends AppCompatActivity {

    Session session;
    TextView alamat, name, email, phone;
    String username, address, Email, Phone;
    ImageButton logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        session = new Session(ProfilActivity.this);

        name = findViewById(R.id.profilname);
        email = findViewById(R.id.profilemail);
        alamat = findViewById(R.id.profilalamat);
        phone = findViewById(R.id.profilphone);
        logout = findViewById(R.id.logout);

        username = session.getUserDetail().get("username");
        Email = session.getUserDetail().get(Session.EMAIL);
        address = session.getUserDetail().get(Session.ADDRESS);
        Phone = session.getUserDetail().get("phone");

        session.getUserDetail();
        name.setText(username);
        email.setText(Email);
        alamat.setText(address);
        phone.setText(Phone);

    }
    public void back(View view) {
        Intent Intent = new Intent(ProfilActivity.this, ProfilActivity.class);
        startActivity(Intent);
    }

    private void moveToLogin() {
        Intent intent = new Intent(ProfilActivity.this, LogUserActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent) ;
        finish();
    }

    public void logout(){
        session.logOutSession();
        moveToLogin();
    }
}