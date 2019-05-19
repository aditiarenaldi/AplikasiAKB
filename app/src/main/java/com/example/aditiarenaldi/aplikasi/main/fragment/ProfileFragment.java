package com.example.aditiarenaldi.aplikasi.main.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aditiarenaldi.aplikasi.R;

////NIM : 10116359
////Nama : Aditia Renaldi
////Kelas : IF-8
////Tanggal Pengerjaan : 17 Mei 2019

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.fragment_profile,container,false);
    }

}
