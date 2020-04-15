package com.example.wellnessapp;

public class Med {

    int image, sound;
    String word, pronounce;

    public Med(int image, String word, String pronounce, int sound){
        this.image = image;
        this.word = word;
        this.pronounce = pronounce;
        this.sound = sound;
    }

    public int getImage(){
        return image;
    }

    public String getWord(){
        return word;
    }

    public String getPronounce(){
        return pronounce;
    }

    public int getSound(){
        return sound;
    }
}
