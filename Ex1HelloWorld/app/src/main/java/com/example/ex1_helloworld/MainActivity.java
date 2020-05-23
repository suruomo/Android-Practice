package com.example.ex1_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLick(View view){
        TextView textView=findViewById(R.id.text);
        String s="";
        if(flag==true){
            s="Hello";
            textView.setText(s);
            flag=false;
        }
        else{
            s="GoodBye";
            textView.setText(s);
            flag=true;
        }
    }

}
