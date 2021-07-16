package com.example.star_delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    EditText editTextFullName, editTextEmailid, editTextContactNumber, editTextAddress;
    Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextFullName = findViewById(R.id.etFullName);
        editTextEmailid = findViewById(R.id.etEmailid);
        editTextContactNumber = findViewById(R.id.etContactNumber);
        editTextAddress = findViewById(R.id.etAddress);

        editTextFullName.addTextChangedListener(signUpTextWatcher);
        editTextEmailid.addTextChangedListener(signUpTextWatcher);
        editTextContactNumber.addTextChangedListener(signUpTextWatcher);
        editTextAddress.addTextChangedListener(signUpTextWatcher);


        buttonSignUp = (Button) findViewById(R.id.btnSignUp);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboard();
            }
        });
    }
    private TextWatcher signUpTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String fullNameInput = editTextFullName.getText().toString().trim();
            String emailIdInput = editTextEmailid.getText().toString().trim();
            String contactNumberInput = editTextContactNumber.getText().toString().trim();
            String addressInput = editTextAddress.getText().toString().trim();

            buttonSignUp.setEnabled(!fullNameInput.isEmpty() && !emailIdInput.isEmpty() && !contactNumberInput.isEmpty()
            && !addressInput.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    public void dashboard()
    {
        Intent intentDashboard = new Intent(signup.this,dashboardActivity.class);
        startActivity(intentDashboard);
    }
}