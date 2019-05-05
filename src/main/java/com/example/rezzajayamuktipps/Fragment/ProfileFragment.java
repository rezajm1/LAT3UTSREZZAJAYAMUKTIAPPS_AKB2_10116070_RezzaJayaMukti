package com.example.rezzajayamuktipps.Fragment;

/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rezzajayamuktipps.R;

public class ProfileFragment extends Fragment {

    private ImageButton ig,tw,maps;
    private Button about;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        about = (Button) view.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final Dialog dialog = new Dialog(getActivity());
                dialog.setTitle("About Apps");
                dialog.setContentView(R.layout.activity_about);

                DisplayMetrics metrics = getResources().getDisplayMetrics();
                int width = metrics.widthPixels;
                dialog.getWindow().setLayout((6*width)/7, LinearLayout.LayoutParams.WRAP_CONTENT);

                dialog.show();
            }
        });

        ig = (ImageButton) view.findViewById(R.id.instagramBtn);
        ig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showInstagram();
            }
        });

        tw = (ImageButton) view.findViewById(R.id.twitterBtn);
        tw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showTwitter();
            }
        });


        maps = (ImageButton) view.findViewById(R.id.locationBtn);
        maps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showLocation();
            }
        });



        return view;
    }
    void showLocation(){
        String gmmIntentUri="https://www.google.com/maps/place/Jl.+Garu+V+No.19,+Babakan+Sari,+Kiaracondong,+Kota+Bandung,+Jawa+Barat+40283/@-6.9208222,107.6492039,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e7e404b48a2d:0xe0e9c397e299f59a!8m2!3d-6.9208275!4d107.6513926";
        Intent location = new Intent(Intent.ACTION_VIEW);
        location.setData(Uri.parse(gmmIntentUri));
        startActivity(location);
    }

    void showTwitter(){
        String gmmIntentUri="https://twitter.com/rezajm";
        Intent twitter = new Intent(Intent.ACTION_VIEW);
        twitter.setData(Uri.parse(gmmIntentUri));
        startActivity(twitter);
    }

    void showInstagram(){
        String gmmIntentUri="https://www.instagram.com/rezaaajm";
        Intent instagram = new Intent(Intent.ACTION_VIEW);
        instagram.setData(Uri.parse(gmmIntentUri));
        startActivity(instagram);
    }

    void showAbout(){
    }

}
