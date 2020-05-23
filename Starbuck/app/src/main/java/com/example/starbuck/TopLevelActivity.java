package com.example.starbuck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_top_level);

//        列表适配器

            AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch(position){
                        case 0:
                            Intent intent=new Intent(TopLevelActivity.this,DrinksCategoryActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1=new Intent(TopLevelActivity.this,FoodCategoryActivity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2=new Intent(TopLevelActivity.this,AtHomeCofeeCategoryActivity.class);
                            startActivity(intent2);
                            break;
                    }
                }
            };
            ListView listView=findViewById(R.id.list_options);
            listView.setOnItemClickListener(itemClickListener);
        }
}
