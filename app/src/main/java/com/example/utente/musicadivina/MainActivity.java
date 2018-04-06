package com.example.utente.musicadivina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton floatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the contentView
        setContentView(R.layout.activity_main);

        floatButton = (ImageButton) findViewById(R.id.addbutton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Wish you add new Melodies?", Toast.LENGTH_LONG).show();
            }
        });

        //Wilderer Radio
        final TextView Wilderer = (TextView) findViewById(R.id.Wilderer);

        Wilderer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent wildererIntent = new Intent(MainActivity.this, WildererRadio.class);
                startActivity(wildererIntent);
            }
        });

        //Veracini Radio
        final TextView Veracini = (TextView) findViewById(R.id.Veracini);

        Veracini.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent veraciniIntent = new Intent(MainActivity.this, VeraciniRadio.class);
                startActivity(veraciniIntent);
            }

        });

        //Steffani Radio
        final TextView Steffani = (TextView) findViewById(R.id.Steffani);

        Steffani.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent steffaniIntent = new Intent(MainActivity.this, SteffaniRadio.class);
                startActivity(steffaniIntent);
            }
        });

        //Moratelli Radio
        final TextView Moratelli = (TextView) findViewById(R.id.Moratelli);


        Moratelli.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent moratelliIntent = new Intent(MainActivity.this, MoratelliRadio.class);
                startActivity(moratelliIntent);
            }
        });

    }
}
