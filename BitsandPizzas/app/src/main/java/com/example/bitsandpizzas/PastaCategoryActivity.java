package com.example.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PastaCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_category);
        //        设置头部工具栏
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<Pasta> listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Pasta.pastas);
        ListView listDrinks=findViewById(R.id.list_pastas);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(PastaCategoryActivity.this,PastaActivity.class);
                intent.putExtra(PastaActivity.EXTRA_PASTAID,(int)id);
                startActivity(intent);
            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
