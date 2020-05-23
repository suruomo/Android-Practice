package com.example.ex3_chinesezodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public static final int zodiac=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int animalid=(Integer) getIntent().getExtras().get(String.valueOf(zodiac));
        Animal animal=Animal.animals[animalid];
        TextView personality=findViewById(R.id.personality);
        personality.setText(animal.getPersonality());
        ImageView photo=findViewById(R.id.image);
        photo.setImageResource(animal.getImageResourceId());
        photo.setContentDescription(animal.getName());
    }
}
