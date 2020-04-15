package com.example.wellnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ContentTable extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_table);

        button1 = (Button) findViewById(R.id.Flashbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlashCards();
            }
        });
        button2 = (Button) findViewById(R.id.CrosswordButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrossword();
            }
        });

        button3 = (Button) findViewById(R.id.RnSButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReadSpeak();
            }
        });

        button4 = (Button) findViewById(R.id.AnatomyButton);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnatomy();
            }
        });

        button5 = (Button) findViewById(R.id.PictureButton);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPictureStory();
            }
        });
    }

    public void openFlashCards(){
        Intent intent = new Intent(this, FlashCards.class);
        startActivity(intent);
    }

    public void openCrossword(){
        Intent intent = new Intent(this, CrosswordMenu.class);
        startActivity(intent);
    }

    public void openReadSpeak(){
        Intent intent = new Intent(this, ReadSpeak.class);
        startActivity(intent);
    }

    public void openAnatomy(){
        Intent intent = new Intent(this, Anatomy.class);
        startActivity(intent);
    }

    public void openPictureStory(){
        Intent intent = new Intent(this, pstoryMenu.class);
        startActivity(intent);
    }
}
