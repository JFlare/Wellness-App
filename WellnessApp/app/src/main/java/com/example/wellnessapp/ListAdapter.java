package com.example.wellnessapp;

import android.content.Context;
//import android.content.DialogInterface;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AlertDialog;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class ListAdapter extends ArrayAdapter<Med> {

    List<Med> medList;

    Context context;

    int resource;

    public ListAdapter(Context context, int resource, List<Med> medList){
        super(context, resource, medList);
        this.context = context;
        this.resource = resource;
        this.medList = medList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textWord = view.findViewById(R.id.textWord);
        TextView textPronounce = view.findViewById(R.id.textPronounce);
        Button buttonListen = (Button)view.findViewById(R.id.buttonListen);

        Med med = medList.get(position);

        final MediaPlayer mp = MediaPlayer.create(context, med.getSound());
        imageView.setImageDrawable(context.getResources().getDrawable(med.getImage()));
        textWord.setText(med.getWord());
        textPronounce.setText(med.getPronounce());

        buttonListen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp.start();
            }
        });

        return view;
    }
}
