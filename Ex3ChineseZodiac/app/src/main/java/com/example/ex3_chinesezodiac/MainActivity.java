package com.example.ex3_chinesezodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText text=findViewById(R.id.editText);
        int year=0;
        try{
            year= Integer.parseInt(text.getText().toString());
        }catch (Exception e){
            Toast toast=Toast.makeText(this,"Please input the correct number!",Toast.LENGTH_LONG);
            toast.show();
        }
        int zodiac=calZodiac(year);
        Intent intent=new Intent(MainActivity.this,ResultActivity.class);
        intent.putExtra(String.valueOf(ResultActivity.zodiac),zodiac);
        startActivity(intent);
    }
    /**
     *定义一个内部方法，该方法根据传来的年份参数，返回其所属的生肖
     **/
    public static int calZodiac(int year)
    {
        int zodiac=0;
        int remainder=year%12;

        switch(remainder){
            case 0:
                zodiac=8;//monkey
                break;
            case 1:
                zodiac=9;
                break;
            case 2:
                zodiac=10;
                break;
            case 3:
                zodiac=11;
                break;
            case 4:
                zodiac=0;//rat
                break;
            case 5:
                zodiac=1;
                break;
            case 6:
                zodiac=2;//tiger
                break;
            case 7:
                zodiac=3;//rabbit
                break;
            case 8:
                zodiac=4;//dragon
                break;
            case 9:
                zodiac=5;//snake
                break;
            case 10:
                zodiac=6;
                break;
            case 11:
                zodiac=7;
                break;
        }
        return zodiac;
    }
}
