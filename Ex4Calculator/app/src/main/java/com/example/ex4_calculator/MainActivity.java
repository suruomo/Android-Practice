package com.example.ex4_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn_1;  Button btn_0;
    Button btn_2;  Button btn_7;
    Button btn_3;  Button btn_8;  Button btn_plus;
    Button btn_4;  Button btn_9;  Button btn_minus;
    Button btn_5;  Button btn_a;  Button btn_multipy;
    Button btn_divide;  Button btn_mod;
    Button btn_6;  Button btn_b;
    Button btn_clear;
    EditText et_input;
    boolean clear_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0=(Button) findViewById(R.id.btn_0);
        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);
        btn_4=(Button) findViewById(R.id.btn_4);   btn_9=(Button) findViewById(R.id.btn_9);
        btn_5=(Button) findViewById(R.id.btn_5);
        btn_6=(Button) findViewById(R.id.btn_6);
        btn_7=(Button) findViewById(R.id.btn_7);
        btn_8=(Button) findViewById(R.id.btn_8);
        btn_clear=(Button) findViewById(R.id.btn_clear);
        btn_mod=(Button) findViewById(R.id.btn_mod);
        btn_divide=(Button) findViewById(R.id.btn_divide);
        btn_multipy=(Button) findViewById(R.id.btn_multipy);
        btn_minus=(Button) findViewById(R.id.btn_minus);
        btn_plus=(Button) findViewById(R.id.btn_plus);
        btn_a=(Button) findViewById(R.id.btn_a);
        btn_b=(Button) findViewById(R.id.btn_b);
        //实例化按钮
        et_input=(EditText)findViewById(R.id.et_input);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_a.setOnClickListener(this);
        btn_b.setOnClickListener(this);
        btn_mod.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multipy.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_clear.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        String str = et_input.getText().toString();
        switch (v.getId()) {
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_b:
                if(clear_flag)
                {
                    clear_flag=false;
                    str="";
                    et_input.setText("");
                }
                et_input.setText(str + ((Button) v).getText());
                break;
            case R.id.btn_plus:
            case R.id.btn_multipy:
            case R.id.btn_divide:
            case R.id.btn_mod:
            case R.id.btn_minus:
                if(clear_flag)
                {
                    clear_flag=false;
                    str="";
                    et_input.setText("");
                }
                //判断用
                et_input.setText(str + " " + ((Button) v).getText() + " ");
                break;
            case R.id.btn_clear:
                if(clear_flag)
                {
                    clear_flag=false;
                    str="";
                    et_input.setText("");
                }
                et_input.setText("");
                break;

            case R.id.btn_a:
                getresult();
                break;
        }
    }
    private void getresult()
    {  String exp=et_input.getText().toString();
        if(exp==null||exp.equals(""))
        {
            return;
        }
        if(!exp.contains(" "))
        {
            return;
        }
        if(clear_flag)
        {
            clear_flag=false;
            return;
        }
        clear_flag=true;
        double result=0;
        String s1=exp.substring(0,exp.indexOf(" "));
        String op=exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2);
        String s2=exp.substring(exp.indexOf(" ")+3);
        if(!s1.equals("")&&!s2.equals("")) {
            double d1= Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            //强制类型转换

            if (op.equals("＋")) {
                result = d1 + d2;
            } else if (op.equals("－")) {
                result = d1-d2;
            } else if (op.equals("×")) {
                result=d1*d2;
            } else if (op.equals("÷")) {
                if(d1==0)
                {result=0;}else  result=d1/d2;
            }
            else if(op.equals("%")){
                result=d1%d2;
            }
            if(!s1.contains(".")&&!s2.contains(".")&&!op.equals("÷")){
                int r = (int)result;
                et_input.setText(r + "");
            }
            else
            {et_input.setText(result + "");}
        }else if(!s1.equals("")&&s2.equals(""))
        {
            et_input.setText(exp);
        }else if(s1.equals("")&&!s2.equals(""))
        {   double d2= Double.parseDouble(s2);
            if (op.equals("+")) {
                result = 0 + d2;
            } else if (op.equals("-")) {
                result = 0 - d2;
            } else if (op.equals("×")) {
                result=0*d2;
            } else if (op.equals("÷")) {
                result=0;
            }else if (op.equals("%")) {
                result=0;
            }
        }
        else {
            et_input.setText("");
        }
    }
}