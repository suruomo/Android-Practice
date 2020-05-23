package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloToastActivity extends AppCompatActivity {
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellotoast);
    }
    public void onClickToast(View view){
        Toast toast=Toast.makeText(this,"Hello Toast!",Toast.LENGTH_LONG);
        toast.show();
    }
    public void onClickCount(View view){
        TextView textView=(TextView)findViewById(R.id.textView);
        count++;
        textView.setText(String.valueOf(count));
    }
}
