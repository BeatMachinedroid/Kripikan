package com.example.kripikan;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kripikan.api.ApiClient;
import com.example.kripikan.model.Register.Register;
import com.example.kripikan.R;
import com.example.kripikan.api.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usernamereg, emailreg, alamatreg, phonereg, passreg;
    ImageButton register;
    ApiInterface apiInterface;
    String username, email, alamat, phone, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        usernamereg = findViewById(R.id.usernamereg);
        emailreg = findViewById(R.id.emailreg);
        alamatreg = findViewById(R.id.alamatreg);
        phonereg = findViewById(R.id.phonereg);
        passreg = findViewById(R.id.passreg);
        register = findViewById(R.id.btnregister);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnregister:
                username = usernamereg.getText().toString();
                email = emailreg.getText().toString();
                alamat = alamatreg.getText().toString();
                phone = phonereg.getText().toString();
                pass = passreg.getText().toString();
                register(username, email,alamat, phone, pass);
                break;
        }
    }

    private void register(String username, String email, String alamat, String phone, String pass) {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Register> registerCall = apiInterface.registerResponse(username, email, alamat, phone, pass);
        registerCall.enqueue(new Callback<Register>() {
            @Override
            public void onResponse(Call<Register> call, Response<Register> response) {
                if(response.body() != null && response.isSuccessful() && response.body().isError()) {
                    Toast.makeText(SignActivity.this, response.body().getUser().getUsername(), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Register> call, Throwable t) {
                Toast.makeText(SignActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        Intent intent = new Intent(this, LogUserActivity.class);
        startActivity(intent);
        finish();
    }
}








