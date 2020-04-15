package com.example.wellnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Anatomy extends AppCompatActivity {

    List<Med> medList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomy);

        medList = new ArrayList<>();
        listView = findViewById(R.id.listView);

        medList.add(new Med(R.drawable.obesity, "Obesity", "'oh BEE sit ee'", R.raw.obesity));
        medList.add(new Med(R.drawable.perscription, "Prescription", "'pre SCRIP shun'", R.raw.prescription));
        medList.add(new Med(R.drawable.clinic, "Care Center", "'Kare Senter'", R.raw.carecenter));
        medList.add(new Med(R.drawable.sorethroat, "Sore Throat", "'SOR th ROT'", R.raw.sorethroat));
        medList.add(new Med(R.drawable.symptoms, "Symptoms", "'SIMP tums'", R.raw.syptoms));
        medList.add(new Med(R.drawable.medicine, "Medicine", "'MED uh sin'", R.raw.medicine));
        medList.add(new Med(R.drawable.fever, "Fever", "'FEE ver'", R.raw.fever));
        medList.add(new Med(R.drawable.appointment, "Appointment", "'uh POINT ment'", R.raw.appointment));
        medList.add(new Med(R.drawable.emergency, "Emergency", "'ee MER gen SEE'", R.raw.emergency));
        medList.add(new Med(R.drawable.checkup, "Checkup", "'CHECK up'", R.raw.checkup));
        medList.add(new Med(R.drawable.vaccine, "Vaccine", "Vak seen", R.raw.vaccine));

        ListAdapter adapter = new ListAdapter(this, R.layout.custom_list, medList);

        listView.setAdapter(adapter);
    }
}
