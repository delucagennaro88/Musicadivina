package com.example.utente.musicadivina;

/**
 * Created by Utente on 06/04/2018.
 */

public class Melody {

    // Here is the ID of the Artist's pic
    public int mPicture;
    // Here is the name of the Artist
    public String mArtist;
    // Here is the title of the Work
    public String mOpera;

    // Create the instance of the Melody Object
    public Melody(int mPicture, String mArtist, String mOpera) {
        this.mPicture = mPicture;
        this.mArtist = mArtist;
        this.mOpera = mOpera;
    }

    public int getmPicture() {
        return mPicture;
    }

    public String getmArtist() {
        return mArtist;
    }

    public String getmOpera() {
        return mOpera;
    }

}