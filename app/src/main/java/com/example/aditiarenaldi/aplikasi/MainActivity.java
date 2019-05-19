package com.example.aditiarenaldi.aplikasi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.aditiarenaldi.aplikasi.main.fragment.ContactFragment;
import com.example.aditiarenaldi.aplikasi.main.fragment.ProfileFragment;
import com.example.aditiarenaldi.aplikasi.presenter.MainPresenter;
import com.example.aditiarenaldi.aplikasi.view.MainView;


public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    presenter.changeView(ProfileFragment.newInstance());
                    return true;
                case R.id.navigation_dashboard:
                    presenter.changeView(ContactFragment.newInstance());
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        presenter.changeView(ProfileFragment.newInstance());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void showView(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content,fragment).commit();
    }

}
