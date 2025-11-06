package com.example.nicestart_aitorfuertes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Singup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_singup);
    }

    public void openLogin(View v) {
        Intent intent = new Intent(Singup.this, Login.class);
        startActivity(intent);
    }

    // Method for Signup button
    public void openMain(View v) {
        Intent intent = new Intent(Singup.this, MainActivity.class);
        startActivity(intent);
    }
}