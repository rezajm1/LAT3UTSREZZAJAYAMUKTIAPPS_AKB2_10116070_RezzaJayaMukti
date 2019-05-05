package com.example.rezzajayamuktipps.Adapter;
/*
 * Tanggal Pengerjaan : 02-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.rezzajayamuktipps.R;

public class SliderAdapter extends PagerAdapter{
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context){
        this.context = context;
    }
    public int[] slide_images = {
            R.mipmap.coffee,
            R.mipmap.game,
            R.mipmap.bed
    };

    public String[] slide_headings = {
            "COFFEE",
            "GAME",
            "BED"
    };

    public String[] slide_descs = {
            "Nikmati kehidupan layanknya menyeruput kopi,nikmati aplikasi layaknya juga kopi",
            "Jangan terlalu fokus terhadap game buatan gaben,dkk. Tapi fokus juga pada game buatan Tuhan",
            "Jika kau sebut kenikmatan berasal dari uang itu salah,kenikmatan sesungguhnya yaitu tidur"
    };

    @Override
    public int getCount() {

        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {

        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem( ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((RelativeLayout)object);
    }
}

