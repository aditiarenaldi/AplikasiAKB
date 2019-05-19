package com.example.aditiarenaldi.aplikasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//NIM : 10116359
//Nama : Aditia Renaldi
//Kelas : IF-8
//Tanggal Pengerjaan : 19 Mei 2019

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Intent intent = new Intent(this,com.example.aditiarenaldi.aplikasi.MainActivity.class);
        startActivity(intent);
        finish();
    }
}
