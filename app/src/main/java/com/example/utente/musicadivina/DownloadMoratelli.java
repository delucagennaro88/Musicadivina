package com.example.utente.musicadivina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DownloadMoratelli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_moratelli);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}