package com.example.wellnessapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class fatImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[]mImageIds = new int[] {R.drawable.ic_1_fatima,R.drawable.ic_2_appointment,R.drawable.ic_3_how_do_yo_spell,R.drawable.ic_4_tuma,R.drawable.ic_5_headache_and_sorethroat,R.drawable.ic_6_fever,R.drawable.ic_7_no_fever,R.drawable.ic_8_come_in_at_10,R.drawable.ic_9_thankyou};

    fatImageAdapter(Context contex){
        mContext=contex;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;

    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
