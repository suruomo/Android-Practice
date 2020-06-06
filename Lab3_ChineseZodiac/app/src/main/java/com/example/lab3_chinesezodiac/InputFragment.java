package com.example.lab3_chinesezodiac;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class InputFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.fragment_input, container, false);
        Button myButton = (Button) view.findViewById(R.id.button);
        final EditText edittext=(EditText) view.findViewById(R.id.year);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year=0;
                year= Integer.parseInt(edittext.getText().toString());
                int zodiac=calZodiac(year);
                System.out.println(zodiac);
                Intent intent=new Intent(getActivity(),DetailActivity.class);
                intent.putExtra(String.valueOf(DetailActivity.id),zodiac);
                startActivity(intent);
            }
        });
        return view;
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
