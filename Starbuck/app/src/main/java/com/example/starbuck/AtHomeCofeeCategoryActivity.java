package com.example.starbuck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AtHomeCofeeCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at_home_cofee_category);
        ArrayAdapter<AtHomeCoffee> listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,AtHomeCoffee.atHomeCoffees);
        ListView listDrinks=findViewById(R.id.list_atHomes);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(AtHomeCofeeCategoryActivity.this,AtHomeCoffeeActivity.class);
                intent.putExtra(AtHomeCoffeeActivity.EXTRA_ID,(int)id);
                startActivity(intent);
            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
