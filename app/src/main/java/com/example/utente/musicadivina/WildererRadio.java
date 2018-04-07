package com.example.utente.musicadivina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Utente on 04/04/2018.
 */

public class WildererRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilderer_radio);

        final TextView DownloadWilderer = findViewById(R.id.downloadWilderer);

        DownloadWilderer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(WildererRadio.this, DownloadWilderer.class);
                startActivity(downloadIntent);
            }
        });

    }
}
