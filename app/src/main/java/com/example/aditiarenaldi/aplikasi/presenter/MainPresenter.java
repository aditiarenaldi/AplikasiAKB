package com.example.aditiarenaldi.aplikasi.presenter;

import android.support.v4.app.Fragment;

import com.example.aditiarenaldi.aplikasi.MainActivity;
import com.example.aditiarenaldi.aplikasi.view.MainView;

public class MainPresenter {

    private MainView view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }

    public void changeView(Fragment fragment) {
        view.showView(fragment);
    }
}
