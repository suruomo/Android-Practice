package com.example.studentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            StudentFragment studentFragment=new StudentFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,studentFragment,null);
            fragmentTransaction.commit();
        }
    }
}
