package com.example.rezzajayamuktipps.Fragment;
/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rezzajayamuktipps.Adapter.MusikAdapter;
import com.example.rezzajayamuktipps.Model.ModelMusik;
import com.example.rezzajayamuktipps.R;

import java.util.ArrayList;

public class MusikFragment extends Fragment {

    private RecyclerView recyclerView;

    private MusikAdapter adaptermusik;

    private ArrayList<ModelMusik> modelmusik;

    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musik,container,false);

        addMusik();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclermusik);
        adaptermusik = new MusikAdapter(modelmusik);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adaptermusik);

        return view;
    }

    void addMusik(){
        modelmusik = new ArrayList<>();
        modelmusik.add(new ModelMusik("Kendrick Lamar","Humble"));
        modelmusik.add(new ModelMusik("OFFONOFF","Cigarette"));
        modelmusik.add(new ModelMusik("Travis Scott","Goosebump"));
        modelmusik.add(new ModelMusik("gianni & kyle","Fuck boi"));
        modelmusik.add(new ModelMusik("Lost King","Drunk as Hell"));
        modelmusik.add(new ModelMusik("XXXTENTACION","SAD!"));
        modelmusik.add(new ModelMusik("KYLE,2 Chainz,Sophia Black","ikuyo"));
        modelmusik.add(new ModelMusik("Blackbear","fashion week"));
        modelmusik.add(new ModelMusik("Blackbear","Wanderlust"));
        modelmusik.add(new ModelMusik("Blackbear","4u"));
        modelmusik.add(new ModelMusik("Jeremy Zucker","All The Kidz Depressed"));


    }
}
