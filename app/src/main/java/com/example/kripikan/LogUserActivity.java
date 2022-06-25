package com.example.kripikan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.kripikan.api.ApiClient;
import com.example.kripikan.api.ApiInterface;
import com.example.kripikan.model.Login.Login;
import com.example.kripikan.model.Login.UserLogin;
import com.example.kripikan.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogUserActivity extends AppCompatActivity implements View.OnClickListener{

    EditText lusername, lpass;
    ImageButton login;
    String username, pass;
    ApiInterface apiInterface;
    Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_user);

        lusername = findViewById(R.id.lusername);
        lpass = findViewById(R.id.lpass);
        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                username = lusername.getText().toString();
                pass = lpass.getText().toString();
                login(username, pass);
                break;
        }
    }

    private void login(String username, String pass) {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Login> loginCall = apiInterface.loginResponse(username,pass);
        loginCall.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if(response.body() != null && response.isSuccessful() && response.body().isError()) {
                    Toast.makeText(LogUserActivity.this, response.body().getUser().getUsername(), Toast.LENGTH_SHORT).show();
                    session = new Session(LogUserActivity.this);
                    UserLogin dataLogin = response.body().getUser();
                    session.createLoginSession(dataLogin);


                }else{
                    Toast.makeText(LogUserActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                Toast.makeText(LogUserActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        Intent intent = new Intent(LogUserActivity.this, ProductActivity.class);
        startActivity(intent);
        finish();
    }
}