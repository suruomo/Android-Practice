package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID="drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkid=(Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink=Drink.drinks[drinkid];
        TextView name=findViewById(R.id.name);
        name.setText(drink.getName());
        TextView description=findViewById(R.id.description);
        description.setText(drink.getDescription());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
