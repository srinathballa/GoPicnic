package com.gopicinic;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView tv_email, tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv_email = findViewById(R.id.tv_email);
        tv_name = findViewById(R.id.tv_name);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("key_email", "defaultValue");
        tv_email.setText("Email :" + email);
        tv_name.setText("Name :" + "Srinath");

    }
}