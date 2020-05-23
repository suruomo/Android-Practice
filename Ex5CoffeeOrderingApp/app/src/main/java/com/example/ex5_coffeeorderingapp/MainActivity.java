package com.example.ex5_coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static  int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOrder(View view){
        CheckBox whippedcream=findViewById(R.id.whippedcream);
        CheckBox chocolate=findViewById(R.id.chocolate);
        TextView summary=findViewById(R.id.summary);
        String whippedcream_flag="false";
        String chocolate_flag="false";
        double price=0;
        price=quantity*4;
        if(whippedcream.isChecked()){
            price+=0.5*quantity;
            whippedcream_flag="true";
        }
        if(chocolate.isChecked()){
            price+=1*quantity;
            chocolate_flag="true";
        }
        String text="Add whipped cream?"+whippedcream_flag+"\n"+"Add chocolate?"+chocolate_flag+"\n"+"Quantity:"+quantity+"\n"+"Total:$"+price+"\n"+"Thank you!";
        summary.setText(text);

    }

    public void onClickMinus(View view){
        TextView count=findViewById(R.id.quantity);
        quantity--;
        count.setText(String.valueOf(quantity));

    }
    public void onClickAdd(View view){
        TextView count=findViewById(R.id.quantity);
        quantity++;
        count.setText(String.valueOf(quantity));
    }
}
