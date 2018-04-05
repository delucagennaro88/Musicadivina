package com.example.utente.musicadivina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton floatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        floatButton = (ImageButton) findViewById(R.id.addbutton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Wish you add new Melodies?", Toast.LENGTH_LONG).show();
            }
        });

        //Find the View that shows the Wilderer Radio
        final TextView Wilderer = (TextView) findViewById(R.id.Wilderer);

        //Set click listener on that view
        Wilderer.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Wilderer View is clicked on.
            @Override
            public void onClick(View v) {
                Intent wildererIntent = new Intent(MainActivity.this, WildererRadio.class);
                startActivity(wildererIntent);
            }
        });

        //Find the View that shows Veracini Radio
        final TextView Veracini = (TextView) findViewById(R.id.Veracini);

        //Set click listener on that view
        Veracini.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Veracini View is clicked on.
            @Override
            public void onClick(View v) {
                Intent veraciniIntent = new Intent(MainActivity.this, VeraciniRadio.class);
                startActivity(veraciniIntent);
            }

        });

        //Find the View that shows Steffani Radio
        final TextView Steffani = (TextView) findViewById(R.id.Steffani);

        //Set click listener on that view
        Steffani.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Steffani View is clicked on.
            @Override
            public void onClick(View v) {
                Intent steffaniIntent = new Intent(MainActivity.this, SteffaniRadio.class);
                startActivity(steffaniIntent);
            }
        });

        //Find the View that shows the Moratelli Radio
        final TextView Moratelli = (TextView) findViewById(R.id.Moratelli);

        //Set click listener on that view
        Moratelli.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Moratelli View is clicked on.
            @Override
            public void onClick(View v) {
                Intent moratelliIntent = new Intent(MainActivity.this, MoratelliRadio.class);
                startActivity(moratelliIntent);
            }
        });

    }
}
