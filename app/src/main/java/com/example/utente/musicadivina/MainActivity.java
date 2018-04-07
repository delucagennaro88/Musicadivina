package com.example.utente.musicadivina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton floatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the contentView
        setContentView(R.layout.activity_main);

        // New Melodies
        floatButton = findViewById(R.id.addbutton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent melodiesIntent = new Intent(MainActivity.this, NewMelodies.class);
                startActivity(melodiesIntent);
            }
        });


        //Wilderer Radio
        final TextView Wilderer = findViewById(R.id.Wilderer);

        Wilderer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent wildererIntent = new Intent(MainActivity.this, WildererRadio.class);
                startActivity(wildererIntent);
            }
        });

        //Veracini Radio
        final TextView Veracini = findViewById(R.id.Veracini);

        Veracini.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent veraciniIntent = new Intent(MainActivity.this, VeraciniRadio.class);
                startActivity(veraciniIntent);
            }

        });

        //Steffani Radio
        final TextView Steffani = findViewById(R.id.Steffani);

        Steffani.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent steffaniIntent = new Intent(MainActivity.this, SteffaniRadio.class);
                startActivity(steffaniIntent);
            }
        });

        //Moratelli Radio
        final TextView Moratelli = findViewById(R.id.Moratelli);

        Moratelli.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent moratelliIntent = new Intent(MainActivity.this, MoratelliRadio.class);
                startActivity(moratelliIntent);
            }
        });

    }
}