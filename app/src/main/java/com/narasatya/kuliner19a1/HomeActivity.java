package com.narasatya.kuliner19a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bnvMenuBawah;
    private FrameLayout flContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bukaFragment(new AboutFragment());
        getSupportActionBar().setTitle("About");

        bnvMenuBawah = findViewById(R.id.bnv_menu);
        flContainer = findViewById(R.id.fl_container);

        bnvMenuBawah.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment FR;

                switch (item.getItemId()){

                    case R.id.menu_home:
                        bukaFragment(new HomeFragment());
                        getSupportActionBar().setTitle("Home");
                        return true;

                    case R.id.menu_crud:
                        bukaFragment(new CrudFragment());
                        getSupportActionBar().setTitle("Crud");
                        return true;

                    case R.id.menu_about:
                        bukaFragment(new AboutFragment());
                        getSupportActionBar().setTitle("About");
                        return true;



                }


                return false;
            }
        });

    }

    //membuat method
    private void bukaFragment (Fragment FRG) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.fl_container,FRG);
        FT.commit();

    }



}