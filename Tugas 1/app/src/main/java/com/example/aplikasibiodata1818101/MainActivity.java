package com.example.aplikasibiodata1818101;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bprofil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bprofil = findViewById(R.id.bprofil);
        bprofil.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.bprofil):
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
                break;

        }
    }
}