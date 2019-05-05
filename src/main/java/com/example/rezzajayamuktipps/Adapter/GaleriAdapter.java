package com.example.rezzajayamuktipps.Adapter;
/*
 * Tanggal Pengerjaan : 05-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rezzajayamuktipps.R;

public class GaleriAdapter extends RecyclerView.Adapter<GaleriAdapter.ActivitydailyViewHolder> {
    private int[] datagambar;
    public GaleriAdapter(){
        datagambar = new int[30];
        for (int i = 0; i < 30; i++){
            datagambar[i] = R.mipmap.foto1;
        }
    }

    @NonNull
    @Override
    public GaleriAdapter.ActivitydailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.galeri_layout,parent, false);
        return new ActivitydailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GaleriAdapter.ActivitydailyViewHolder holder, int position) {
        holder.imageView.setImageResource(datagambar[position]);

    }

    @Override
    public int getItemCount() {
        return datagambar.length;
    }

    public class ActivitydailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ActivitydailyViewHolder(@NonNull View itemView){
            super(itemView);

            imageView=(ImageView) itemView.findViewById(R.id.img);
        }
    }
}
