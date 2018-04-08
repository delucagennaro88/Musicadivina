package com.example.utente.musicadivina;

/**
 * Created by Utente on 06/04/2018.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MelodyAdapter extends ArrayAdapter<Melody> {

    public Context mContext;
    public List<Melody> melodiesList = new ArrayList<>();

    public MelodyAdapter(@NonNull Context context, ArrayList<Melody> list) {
        super(context, 0, list);
        mContext = context;
        melodiesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        Melody currentMelody = melodiesList.get(position);

        ImageView image = listItem.findViewById(R.id.image_album);
        image.setImageResource(currentMelody.getmPicture());

        TextView name = listItem.findViewById(R.id.artist_name);
        name.setText(currentMelody.getmArtist());

        TextView opera = listItem.findViewById(R.id.opera_title);
        opera.setText(currentMelody.getmOpera());

        return listItem;
    }
}