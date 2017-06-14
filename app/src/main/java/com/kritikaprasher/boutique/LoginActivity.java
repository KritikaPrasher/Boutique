package com.kritikaprasher.boutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.InjectView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @InjectView(R.id.loginname)
    EditText loginname;

    @InjectView(R.id.loginemail)
    EditText loginemail;

    @InjectView(R.id.password)
    EditText password;


    @InjectView(R.id.loginbtn)
    Button login;

    @InjectView(R.id.registerbtn)
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
