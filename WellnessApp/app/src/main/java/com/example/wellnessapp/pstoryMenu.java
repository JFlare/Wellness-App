package com.example.wellnessapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class pstoryMenu extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pstory_menu);

        button1 = (Button) findViewById(R.id.MariaButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMariaStory();
            }
        });
        button2 = (Button) findViewById(R.id.FatimaButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFatimaStory();
            }
        });
    }

    public void openMariaStory(){
        Intent intent = new Intent(this, MariaStory.class);
        startActivity(intent);
    }

    public void openFatimaStory(){
        Intent intent = new Intent(this, FatimaStory.class);
        startActivity(intent);
    }
}
