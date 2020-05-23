package com.example.starbuck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinksActivity extends AppCompatActivity {

    public static final String EXTRA_ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        int id=(Integer) getIntent().getExtras().get(EXTRA_ID);
        Drinks drinks=Drinks.drinks[id];
        TextView name=findViewById(R.id.name);
        name.setText(drinks.getName());
        TextView ingredients=findViewById(R.id.ingredients);
        ingredients.setText(drinks.getIngredients());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(drinks.getImageResourceId());
        photo.setContentDescription(drinks.getName());
    }
}
