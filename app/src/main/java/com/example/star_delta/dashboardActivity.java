package com.example.star_delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class dashboardActivity extends AppCompatActivity {

    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        LinearLayout linearLayoutShopping = findViewById(R.id.llShopping);
        linearLayoutShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShopping = new Intent(dashboardActivity.this, shoppingActivity.class);
                startActivity(intentShopping);
            }
        });
        LinearLayout linearLayoutProducts = findViewById(R.id.llProducts);
        linearLayoutProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProducts = new Intent(dashboardActivity.this, productsActivity.class);
                startActivity(intentProducts);
            }
        });
        LinearLayout linearLayoutMentors = findViewById(R.id.llMentors);
        linearLayoutMentors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMentors = new Intent(dashboardActivity.this, mentorsActivity.class);
                startActivity(intentMentors);
            }
        });
        LinearLayout linearLayoutPayment = findViewById(R.id.llPayment);
        linearLayoutPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPayment = new Intent(dashboardActivity.this, paymentActivity.class);
                startActivity(intentPayment);
            }
        });

        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
    }
}
