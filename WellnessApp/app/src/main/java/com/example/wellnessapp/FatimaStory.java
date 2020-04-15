package com.example.wellnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class FatimaStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatima_story);

        ViewPager viewPager = findViewById(R.id.fatViewPager);
        fatImageAdapter adapter = new fatImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}