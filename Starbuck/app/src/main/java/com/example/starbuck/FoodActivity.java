package com.example.starbuck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_ID="id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int id=(Integer) getIntent().getExtras().get(EXTRA_ID);
        Food food=Food.food[id];
        TextView name=findViewById(R.id.name);
        name.setText(food.getName());
        TextView ingredients=findViewById(R.id.ingredients);
        ingredients.setText(food.getIngredients());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}
