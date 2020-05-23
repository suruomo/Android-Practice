package com.example.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PastaActivity extends AppCompatActivity {

    public static final String EXTRA_PASTAID="pastaid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
        //        设置头部工具栏
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        int pastaid=(Integer) getIntent().getExtras().get(EXTRA_PASTAID);
        Pasta pasta=Pasta.pastas[pastaid];
        TextView name=findViewById(R.id.name);
        name.setText(pasta.getName());
        TextView description=findViewById(R.id.description);
        description.setText(pasta.getDescription());
        ImageView photo=findViewById(R.id.photo);
        photo.setImageResource(pasta.getImageResourceId());
        photo.setContentDescription(pasta.getName());
    }
}
