package com.example.starbuck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AtHomeCoffeeActivity extends AppCompatActivity {

    public static final String EXTRA_ID="id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at_home_coffee);
        int id=(Integer) getIntent().getExtras().get(EXTRA_ID);
        AtHomeCoffee atHomeCoffee=AtHomeCoffee.atHomeCoffees[id];
        TextView name=findViewById(R.id.name);
        name.setText(atHomeCoffee.getName());
        TextView description=findViewById(R.id.description);
        description.setText(atHomeCoffee.getDescription());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(atHomeCoffee.getImageResourceId());
        photo.setContentDescription(atHomeCoffee.getName());
    }
}
