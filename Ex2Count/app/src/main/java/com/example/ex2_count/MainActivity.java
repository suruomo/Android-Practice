package com.example.ex2_count;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    private boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("ResourceType")
    public void onClickCount(View view){
        TextView textView=(TextView)findViewById(R.id.textView);
        LinearLayout linearLayout=(LinearLayout) findViewById(R.id.linear);
        count++;
        textView.setText(String.valueOf(count));
        if(flag==true){
            linearLayout.setBackgroundColor(getResources().getColor(R.drawable.red));
            flag=false;
        }
        else{
            linearLayout.setBackgroundColor(getResources().getColor(R.drawable.orange));
            flag=true;
        }
    }
}
