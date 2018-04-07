package com.example.utente.musicadivina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Utente on 04/04/2018.
 */

public class VeraciniRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veracini_radio);

        final TextView DownloadVeracini = findViewById(R.id.downloadVeracini);

        DownloadVeracini.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(VeraciniRadio.this, DownloadVeracini.class);
                startActivity(downloadIntent);
            }
        });

    }
}
