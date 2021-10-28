package com.example.wifi_e_bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.List;
import java.util.Set;

public class ActivityBluetooth extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    List<String> dispositivosPareados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        Toast.makeText(ActivityBluetooth.this, "Listagem de bluetooth", Toast.LENGTH_SHORT).show();

        Set<BluetoothDevice> pairedDevices =  bluetoothAdapter.getBondedDevices();

        if(pairedDevices.size() > 0){
            for(BluetoothDevice device : pairedDevices){
                String deviceName = device.getName();
                dispositivosPareados.add(deviceName);
                String deviceHardwareAddress = device.getAddress();
            }
        }
        Toast.makeText(ActivityBluetooth.this, dispositivosPareados.toString(),Toast.LENGTH_SHORT).show();

    }
}