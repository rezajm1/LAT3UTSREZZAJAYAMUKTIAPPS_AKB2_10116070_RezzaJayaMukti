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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rezzajayamuktipps.Adapter.AktifitasAdapter;
import com.example.rezzajayamuktipps.Adapter.KontakAdapter;
import com.example.rezzajayamuktipps.Model.ModelAktifitas;
import com.example.rezzajayamuktipps.Model.ModelKontak;
import com.example.rezzajayamuktipps.R;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    private RecyclerView recyclerView,recyclerView1;

    private AktifitasAdapter adapteraktifitas;
    private KontakAdapter adapterkontak;

    private ArrayList<ModelAktifitas> modelaktifitas;
    private ArrayList<ModelKontak> modelkontak;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily,container,false);

        addAktifitas();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylerdaily);
        adapteraktifitas = new AktifitasAdapter(modelaktifitas);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapteraktifitas);


        addKontak();
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recylerfriend);
        adapterkontak = new KontakAdapter(modelkontak);
        if(recyclerView1!=null)
        {
            recyclerView1.setAdapter(adapterkontak);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),1));
        }

        return view;
    }

    void addAktifitas(){
        modelaktifitas = new ArrayList<>();
        modelaktifitas.add(new ModelAktifitas("06.00","Bangun tidur,solat,tidur lagi "));
        modelaktifitas.add(new ModelAktifitas("09.00","Bangun tidur langsung mandi siap siap ke kampus,tapi gimana jadwal kuliah"));
        modelaktifitas.add(new ModelAktifitas("12.00","Rata rata beres kelas pertama,nongki dulu bentar depan kampus "));
        modelaktifitas.add(new ModelAktifitas("13.00","Masuk kelas kedua"));
        modelaktifitas.add(new ModelAktifitas("15.00","Beres kelas kedua nongkrong lagi sampe bosen"));
        modelaktifitas.add(new ModelAktifitas("16.00","Pulang ke rumah rehat lanjut ngegame sama nugas kalo ada tugas"));
        modelaktifitas.add(new ModelAktifitas("03.00","Harusnya jam segini udah tidur kalo udah ngantuk"));

    }

    void addKontak(){
        modelkontak = new ArrayList<>();
        modelkontak.add(new ModelKontak("Qidam Zola Farhan"));
        modelkontak.add(new ModelKontak("Dikky Dermawan"));
        modelkontak.add(new ModelKontak("Cilem"));
        modelkontak.add(new ModelKontak("M Hafizh Budiman"));
        modelkontak.add(new ModelKontak("Aldi Muhammad Syafi"));
        modelkontak.add(new ModelKontak("Gilang Fahmi"));
        modelkontak.add(new ModelKontak("Fadhel ipad"));
        modelkontak.add(new ModelKontak("Junan"));
        modelkontak.add(new ModelKontak("Maman"));
        modelkontak.add(new ModelKontak("Afif"));
        modelkontak.add(new ModelKontak("Fuad"));
        modelkontak.add(new ModelKontak("Desis"));
        modelkontak.add(new ModelKontak("Rama"));
        modelkontak.add(new ModelKontak("PC tercinta"));
        modelkontak.add(new ModelKontak("Si hitam vario"));
    }
}
