package com.example.lab3_chinesezodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    public static  final String id="id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DetailFragment frag=(DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail);
        int Id=(int) getIntent().getExtras().get(id);
        frag.setId(Id);
    }
}
