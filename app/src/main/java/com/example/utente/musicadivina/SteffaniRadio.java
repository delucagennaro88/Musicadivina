package com.example.utente.musicadivina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Utente on 04/04/2018.
 */

public class SteffaniRadio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steffani_radio);

        //Find the View that shows the Download
        final TextView DownloadSteffani = (TextView) findViewById(R.id.downloadSteffani);

        //Set click listener on that view
        DownloadSteffani.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Steffani View is clicked on.
            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(SteffaniRadio.this, DownloadSteffani.class);
                startActivity(downloadIntent);
            }
        });

    }
}
