package com.example.utente.musicadivina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        final TextView DownloadSteffani = findViewById(R.id.downloadSteffani);

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
