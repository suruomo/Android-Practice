package com.example.studentapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;



public class StudentFragment extends Fragment {

    Button btn_add,btn_edit,btn_viewAll;
    EditText et_name,et_age;
    ListView list;
    ArrayAdapter studentArrayAdapter;
    DatabaseHelper databaseHelper;
    Context context;

    public StudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_student, container, false);
        //Get the current Fragmnet's Context
        context=view.getContext();
        return  view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Variable binding components
        databaseHelper=new DatabaseHelper(context);
        et_name=getActivity().findViewById(R.id.et_name);
        et_age=getActivity().findViewById(R.id.et_age);
        btn_add=getActivity().findViewById(R.id.btn_add);
        btn_edit=getActivity().findViewById(R.id.btn_edit);
        btn_viewAll=getActivity().findViewById(R.id.btn_viewAll);
        list=getActivity().findViewById(R.id.list);
        //Add button listening event
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                StudentModel studentModel = null;
                try{
                    studentModel=new
                            StudentModel(-1,et_name.getText().toString(),
                            Integer.parseInt(et_age.getText().toString()));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                boolean success=databaseHelper.add0ne(studentModel);
                Toast.makeText(getActivity(),"Success="+success,Toast.LENGTH_LONG).show();
            }
        });
        //Edit button listening event
        btn_edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name="";
                int age=0;
                try{
                    name=et_name.getText().toString();
                    age=Integer.valueOf(et_age.getText().toString());
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                databaseHelper.edit0ne(name,age);
            }
        });
        //Query button monitoring events
        btn_viewAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ShowCustomerOnListView(databaseHelper);
            }
        });
        //Listview option monitoring, delete operation when click on an item
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                StudentModel clickStudent=(StudentModel) parent.getItemAtPosition(position);
                databaseHelper.deleteOne(clickStudent);
                ShowCustomerOnListView(databaseHelper);
                Toast.makeText(context,"Delete"+clickStudent.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * Query data and fill the adapter to display to the user
     * @param databaseHelper2
     */
    private void ShowCustomerOnListView(DatabaseHelper databaseHelper2){
        studentArrayAdapter=new ArrayAdapter<StudentModel>(context,android.R.layout.simple_list_item_1,databaseHelper2.getEveryone());
        list.setAdapter(studentArrayAdapter);
    }
}
