package com.example.lab3_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView lv_customerList;
    DatabaseHelper databaseHelper;
    ArrayAdapter customerArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv_customerList=findViewById(R.id.lv_cunstomerList);
        //展示列表
        databaseHelper=new DatabaseHelper(ListActivity.this);
        ShowCustomerOnListView(databaseHelper);
        lv_customerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CustomerModel clickCustomer=(CustomerModel) parent.getItemAtPosition(position);
                databaseHelper.deleteOne(clickCustomer);
                ShowCustomerOnListView(databaseHelper);
                Toast.makeText(ListActivity.this,"Delete"+clickCustomer.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }

    private void ShowCustomerOnListView(DatabaseHelper databaseHelper2){
        customerArrayAdapter=new ArrayAdapter<CustomerModel>(ListActivity.this,android.R.layout.simple_list_item_1,databaseHelper2.getEveryone());
        lv_customerList.setAdapter(customerArrayAdapter);
    }
}
