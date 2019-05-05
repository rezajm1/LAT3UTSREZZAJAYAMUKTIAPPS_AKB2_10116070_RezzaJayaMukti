package com.example.rezzajayamuktipps.Adapter;
/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rezzajayamuktipps.Model.ModelMusik;
import com.example.rezzajayamuktipps.R;

import java.util.ArrayList;

public class MusikAdapter extends RecyclerView.Adapter<MusikAdapter.ActivitydailyViewHolder> {

    private ArrayList<ModelMusik> musiklist;

    public MusikAdapter(ArrayList<ModelMusik> musiklist){
        this.musiklist = musiklist;
    }

    @NonNull
    @Override
    public MusikAdapter.ActivitydailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.musik_layout,parent, false);
        return new ActivitydailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusikAdapter.ActivitydailyViewHolder activitydailyViewHolder, int position) {
        activitydailyViewHolder.txtband.setText(musiklist.get(position).getBand());
        activitydailyViewHolder.txtjudullagu.setText(musiklist.get(position).getJudul());

    }

    @Override
    public int getItemCount() {
        return (musiklist != null) ? musiklist.size() : 0;
    }

    public class ActivitydailyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtjudullagu,txtband;

        public ActivitydailyViewHolder(@NonNull View itemView){
            super(itemView);

            txtband = (TextView) itemView.findViewById(R.id.txt_band);
            txtjudullagu = (TextView) itemView.findViewById(R.id.txt_judullagu);
        }
    }
}
