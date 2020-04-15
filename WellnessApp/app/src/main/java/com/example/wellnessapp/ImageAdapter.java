package com.example.wellnessapp;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[]mImageIds = new int[] {R.drawable.ic_0_this_is_maria,R.drawable.ic_1_maria_was_sick,R.drawable.ic_2_maria_did_not_want_to_go_to_doctor,R.drawable.ic_3_maria_could_not_breath,R.drawable.ic_4_maria_s,R.drawable.ic_5_maria_stayed_in_hospital_3_days,R.drawable.ic_6_maria_had_a_bad_cough,R.drawable.ic_7_maria_does_not_want_to_go_hospital,R.drawable.ic_8_maria_calls_her_doctor,R.drawable.ic_9_maria_asks_for_interpreter, R.drawable.ic_10_ask_maria_for_insurance, R.drawable.ic_11_ask_maria_for_health_card, R.drawable.ic_12_give_maria_form};

    ImageAdapter(Context contex){
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