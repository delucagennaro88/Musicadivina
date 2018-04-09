package com.example.utente.musicadivina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Utente on 06/04/2018.
 */

public class NewMelodies extends AppCompatActivity {

    public ListView listView;
    public MelodyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_melodies);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.melodies_list);

        ArrayList<Melody> melodiesList = new ArrayList<>();

        melodiesList.add(new Melody(R.drawable.moratelli, (getString(R.string.m_name_complete)), (getString(R.string.m_work))));
        melodiesList.add(new Melody(R.drawable.moratelli, (getString(R.string.m_name_complete)), (getString(R.string.m_work_two))));
        melodiesList.add(new Melody(R.drawable.wilderer, (getString(R.string.w_name_complete)), (getString(R.string.w_work))));
        melodiesList.add(new Melody(R.drawable.wilderer, (getString(R.string.w_name_complete)), (getString(R.string.w_work_two))));
        melodiesList.add(new Melody(R.drawable.wilderer, (getString(R.string.w_name_complete)), (getString(R.string.w_work_three))));
        melodiesList.add(new Melody(R.drawable.veracini, (getString(R.string.v_name_complete)), (getString(R.string.v_work))));
        melodiesList.add(new Melody(R.drawable.veracini, (getString(R.string.v_name_complete)), (getString(R.string.v_work_two))));
        melodiesList.add(new Melody(R.drawable.steffani, (getString(R.string.s_name_complete)), (getString(R.string.s_work))));
        melodiesList.add(new Melody(R.drawable.steffani, (getString(R.string.s_name_complete)), (getString(R.string.s_work_two))));
        melodiesList.add(new Melody(R.drawable.steffani, (getString(R.string.s_name_complete)), (getString(R.string.s_work_three))));
        melodiesList.add(new Melody(R.drawable.steffani, (getString(R.string.s_name_complete)), (getString(R.string.s_work_four))));

        mAdapter = new MelodyAdapter(this, melodiesList);
        listView.setAdapter(mAdapter);

    }
}
