package com.example.utente.musicadivina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Utente on 04/04/2018.
 */

public class MoratelliRadio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moratelli_radio);

        final TextView DownloadMoratelli = (TextView) findViewById(R.id.downloadMoratelli);

        DownloadMoratelli.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Moratelli View is clicked on.
            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(MoratelliRadio.this, DownloadMoratelli.class);
                startActivity(downloadIntent);
            }
        });

    }
}
