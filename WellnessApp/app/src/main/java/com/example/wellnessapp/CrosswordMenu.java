package com.example.wellnessapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class CrosswordMenu extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossword_menu);

        button1 = (Button) findViewById(R.id.SickButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSickCross();
            }
        });
        button2 = (Button) findViewById(R.id.NoMariaButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoHospitalCross();
            }
        });
    }

    public void openSickCross(){
        Intent intent = new Intent(this, SickCrossword.class);
        startActivity(intent);
    }

    public void openNoHospitalCross(){
        Intent intent = new Intent(this, MariaCrossword.class);
        startActivity(intent);
    }
}
