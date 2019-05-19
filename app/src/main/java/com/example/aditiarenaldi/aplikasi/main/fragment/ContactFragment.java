package com.example.aditiarenaldi.aplikasi.main.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.aditiarenaldi.aplikasi.view.ContactView;

public class ContactFragment extends Fragment implements ContactView, View.OnClickListener {

    //NIM : 10116359
//Nama : Aditia Renaldi
//Kelas : IF-8
//Tanggal Pengerjaan : 17 Mei 2019


    RelativeLayout lytPhone;
    RelativeLayout lytEmail;
    RelativeLayout lytIG;
    RelativeLayout lytTwitter;

    public ContactFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void actionCall() {

    }

    @Override
    public void actionEmail() {

    }

    @Override
    public void actionInstagram() {

    }

    @Override
    public void actionTwitter() {

    }
}

