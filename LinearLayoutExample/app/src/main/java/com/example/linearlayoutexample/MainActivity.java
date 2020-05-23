package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view){
        TextView name=findViewById(R.id.name);
        String information=name.getText().toString();
        Toast toast=Toast.makeText(this,information,Toast.LENGTH_LONG);
        toast.show();

    }
}
