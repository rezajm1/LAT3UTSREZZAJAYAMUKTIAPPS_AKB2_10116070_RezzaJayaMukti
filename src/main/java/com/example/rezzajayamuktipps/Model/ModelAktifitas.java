package com.example.rezzajayamuktipps.Model;
/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116070
 * Nama     : Rezza Jaya Mukti
 * Kelas    : IF-2 / AKB-2
 */
public class ModelAktifitas {

    private String judul,deskrpsi;
    public ModelAktifitas(String judul, String deskrpsi){
        this.judul = judul;
        this.deskrpsi = deskrpsi;
    }
    public String getJudul(){

        return judul;
    }
    public void setJudul(String judul){

        this.judul = judul;
    }

    public String getDeskrpsi(){

        return deskrpsi;
    }
    public void setDeskrpsi(String deskrpsi){

        this.deskrpsi = deskrpsi;
    }
}
