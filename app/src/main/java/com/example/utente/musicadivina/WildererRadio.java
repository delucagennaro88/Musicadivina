package com.example.utente.musicadivina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        //Find the View that shows the Download
        final TextView DownloadWilderer = (TextView) findViewById(R.id.downloadWilderer);

        //Set click listener on that view
        DownloadWilderer.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Wilderer View is clicked on.
            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(WildererRadio.this, DownloadWilderer.class);
                startActivity(downloadIntent);
            }
        });

    }
}
