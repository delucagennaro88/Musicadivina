package com.example.utente.musicadivina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DownloadWilderer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_wilderer);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}