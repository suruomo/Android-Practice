package com.example.uisimpleapp1;

import androidx.appcompat.app.AppCompatActivity;

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
     public void displayToast(View view){
         EditText editText=findViewById(R.id.editText);
         Toast toast=Toast.makeText(this,editText.getText(),Toast.LENGTH_LONG);
         toast.show();
     }

}
