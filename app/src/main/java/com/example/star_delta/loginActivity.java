package com.example.star_delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText editTextUsername, editTextPassword;
    Button buttonLogin;
    TextView textViewSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = (EditText) findViewById(R.id.etUsername);
        editTextPassword = (EditText) findViewById(R.id.etPassword);

        editTextUsername.addTextChangedListener(loginTextWatcher);
        editTextPassword.addTextChangedListener(loginTextWatcher);

        buttonLogin = (Button) findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboard();
            }
        });

        textViewSignup = (TextView) findViewById(R.id.tvSignup);
        textViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_up();

                Toast.makeText(getApplicationContext(),"Enter details to become member",Toast.LENGTH_LONG).show();
            }
        });

        if (editTextUsername.getText().toString().equals("Admin")){
            editTextUsername.setText(" ");
        }

    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput = editTextUsername.getText().toString().trim();
            String passwordInput = editTextPassword.getText().toString().trim();

            buttonLogin.setEnabled(usernameInput.equals("Admin") && passwordInput.equals("123456"));

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };



    public void dashboard()
    {
        Intent intentDashboard = new Intent(loginActivity.this,dashboardActivity.class);
        startActivity(intentDashboard);
        String usernameInput = editTextUsername.getText().toString();
        String passwordInput = editTextPassword.getText().toString();




    }
    public void sign_up()
    {
        Intent intentSignup = new Intent(loginActivity.this, signup.class);
        startActivity(intentSignup);
    }
}
