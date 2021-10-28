package com.example.wifi_e_bluetooth;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityWiFi extends AppCompatActivity {
    WifiManager wifiManager;
    List<ScanResult> mywifiList;
    List<String> dispositivosWifi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiManager.startScan();
        mywifiList = wifiManager.getScanResults();
        for(ScanResult scanResult : mywifiList){
            dispositivosWifi.add(scanResult.BSSID);
        }
        Toast.makeText(ActivityWiFi.this, dispositivosWifi.toString(), Toast.LENGTH_SHORT).show();
    }
}


