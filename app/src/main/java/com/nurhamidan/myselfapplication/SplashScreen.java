package com.nurhamidan.myselfapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*
    Tanggal Pengerjaan: 19 Mei 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, WalkthroughActivity.class));
        finish();
    }
}
