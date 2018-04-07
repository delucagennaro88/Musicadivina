package com.example.utente.musicadivina;

/**
 * Created by Utente on 06/04/2018.
 */

public class Melody {

    // Here is the ID of the Artist's pic
    private int mPicture;
    // Here is the name of the Artist
    private String mArtist;
    // Here is the title of the Work
    private String mOpera;

    // Create the instance of the Melody Object
    private Melody(int mPicture, String mArtist, String mOpera) {
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