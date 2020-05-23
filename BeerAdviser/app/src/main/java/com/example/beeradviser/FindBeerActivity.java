package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert=new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands=(TextView) findViewById(R.id.brands);
        //Get a reference to the Spinner
        Spinner color=(Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String beerType=String.valueOf(color.getSelectedItem());
        List<String> bandsList=expert.getBrands(beerType);
        StringBuilder brandFormatted=new StringBuilder();
        for (String brand:bandsList){
            brandFormatted.append(brand).append('\n');
        }
        //Display the selected item
        brands.setText(brandFormatted);
    }
}
