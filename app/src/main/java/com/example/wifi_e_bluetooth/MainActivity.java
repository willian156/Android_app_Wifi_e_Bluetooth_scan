package com.example.wifi_e_bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    Button btnBluetooth;
    Button btnWiFi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBluetooth = findViewById(R.id.btnBluetooth);
        btnWiFi = findViewById(R.id.btnWiFi);
    }

    public void startBluetooth(View v){
        Intent bluetooth = new Intent(MainActivity.this, ActivityBluetooth.class);
        startActivity(bluetooth);
    }

    public void startWiFi(View v){
        Intent wiFi = new Intent(MainActivity.this, ActivityWiFi.class);
        startActivity(wiFi);
    }
}