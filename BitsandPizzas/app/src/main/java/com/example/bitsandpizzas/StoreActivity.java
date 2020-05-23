package com.example.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {

    public static final String EXTRA_STOREID="storeid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //        设置头部工具栏
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int storeid=(Integer) getIntent().getExtras().get(EXTRA_STOREID);
        Store store=Store.stores[storeid];
        TextView name=findViewById(R.id.name);
        name.setText(store.getName());
        TextView description=findViewById(R.id.description);
        description.setText(store.getDescription());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(store.getImageResourceId());
        photo.setContentDescription(store.getName());
    }
}
