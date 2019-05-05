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
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rezzajayamuktipps.Adapter.GaleriAdapter;
import com.example.rezzajayamuktipps.R;

public class GaleriFragment extends Fragment {

    private RecyclerView recyclerView;

    private GaleriAdapter adaptergaleri;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_galery,container,false);

        adaptergaleri = new GaleriAdapter();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclergambar);

        if(recyclerView!=null) {
            recyclerView.setAdapter(adaptergaleri);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        }
        return view;
    }
}
