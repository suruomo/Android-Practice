package com.example.lab3_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    Button btn_add,btn_viewAll;
    EditText et_name,et_age;
    Switch sw_activeCustomer;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        btn_add=findViewById(R.id.btn_add);
        btn_viewAll=findViewById(R.id.btn_viewAll);
        et_age=findViewById(R.id.et_age);
        et_name=findViewById(R.id.et_name);
        sw_activeCustomer=findViewById(R.id.sw_active);

        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CustomerModel customerModel;
                try{
                    customerModel=new
                            CustomerModel(-1,et_name.getText().toString(),
                            Integer.parseInt(et_age.getText().toString()),
                            sw_activeCustomer.isChecked()
                    );
                    Toast.makeText(InputActivity.this,customerModel.toString(),Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    Toast.makeText(InputActivity.this,"Error Creating Customer",Toast.LENGTH_LONG).show();
                    customerModel=new CustomerModel(-1,"error",0,false);
                }
                databaseHelper=new DatabaseHelper(InputActivity.this);
                boolean success=databaseHelper.add0ne(customerModel);
                Toast.makeText(InputActivity.this,"Success="+success,Toast.LENGTH_LONG).show();

            }
        });
        btn_viewAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InputActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });


    }

}
