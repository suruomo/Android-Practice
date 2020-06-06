package com.example.lab3_chinesezodiac;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class DetailFragment extends Fragment {
    public int id;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    public void setId(int id){
        this.id=id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view=getView();
        if (view!=null){
            Animal animal=Animal.animals[(int) id];
            ImageView photo=view.findViewById(R.id.image);
            photo.setImageResource(animal.getImageResourceId());
            photo.setContentDescription(animal.getName());
        }

    }
}
