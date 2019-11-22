package com.example.mandira_3rd_assignment;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.mandira_3rd_assignment.aboutus.aboutfrag;
import com.example.mandira_3rd_assignment.addstudent.addstudentfrag;
import com.example.mandira_3rd_assignment.home.homefrag;
import com.example.mandira_3rd_assignment.model.student;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity  extends AppCompatActivity {

    public static List<student> studentsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListner);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new homefrag()).commit();


        studentsList = new ArrayList<>();
        studentsList.add(new student("Ranjan Tamang","Pokhara","Male",22,R.drawable.boy));
        studentsList.add(new student("Mandira Tamang","Kathmandu","Female",21,R.drawable.girl));


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()){

                        case R.id.nav_home:
                            selectFragment = new homefrag();
                            break;
                        case R.id.nav_add:
                            selectFragment = new addstudentfrag();
                            break;
                        case R.id.nav_about:
                            selectFragment = new aboutfrag();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectFragment).commit();
                    return true;
                }
            };
}
