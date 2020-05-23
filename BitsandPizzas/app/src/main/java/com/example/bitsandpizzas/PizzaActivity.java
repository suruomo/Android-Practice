package com.example.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZAID="pizzaid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
//        设置头部工具栏
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int pizzaid=(Integer) getIntent().getExtras().get(EXTRA_PIZZAID);
        Pizza pizza=Pizza.pizzas[pizzaid];
        TextView name=findViewById(R.id.name);
        name.setText(pizza.getName());
        TextView description=findViewById(R.id.description);
        description.setText(pizza.getDescription());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(pizza.getImageResourceId());
        photo.setContentDescription(pizza.getName());
    }
}
