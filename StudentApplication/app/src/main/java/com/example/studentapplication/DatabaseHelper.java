package com.example.studentapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * DatabaseHelper:Database initialization and related data operations can be added, deleted, modified and queried.
 */
public class DatabaseHelper  extends SQLiteOpenHelper {
    /**
     * Database indication and definition of column names in the database
     */
    public static final String STUDENT_TABLE = "STUDENT_TABLE";
    public static final String STUDENT_NAME = "STUDENT_NAME";
    public static final String ID = "ID";
    public static final String STUDENT_AGE = "STUDENT_AGE";

    public DatabaseHelper(FragmentActivity activity, String student_db, Object o, int i) {
        super(activity, "student.db", null, 1);
    }

    public DatabaseHelper(Context context) {
        super(context, "student.db", null, 1);
    }

    /**
     * Create a database
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + STUDENT_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                STUDENT_NAME + " TEXT," + STUDENT_AGE + " INT)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /**
     * Add new data to the database
     * @param studentModel
     * @return
     */
    public boolean add0ne(StudentModel studentModel) {
        // write to database (Write)
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        // Class associate values
        cv.put(STUDENT_NAME, studentModel.getName());
        cv.put(STUDENT_AGE, studentModel.getAge());
        long insert = db.insert(STUDENT_TABLE, null, cv);
        //Returns true if the addition is successful, otherwise returns false
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Query all data in the database
     * @return
     */
    public List<StudentModel> getEveryone() {
        List<StudentModel> returnList = new ArrayList();
        String queryString = "SELECT * FROM " + STUDENT_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        //The cursor starts to query from the first data
        if (cursor.moveToFirst()) {
            do {
                int studentId = cursor.getInt(0);
                String studentName = cursor.getString(1);
                int studentAge = cursor.getInt(2);
                StudentModel newStudent = new StudentModel(studentId, studentName, studentAge);
                returnList.add(newStudent);
            } while (cursor.moveToNext());
            return returnList;
        } else {
        }
        //Close the cursor and database after execution
        cursor.close();
        db.close();
        return returnList;
    }

    /**
     * Delete a piece of data from the database
     * @param studentModel
     * @return
     */
    public boolean deleteOne(StudentModel studentModel) {
        // find studentModel in the database。if it found, delete it and return true.
        // if it is found。return false
        SQLiteDatabase db = this.getWritableDatabase();
        String queryString = "DELETE FROM " + STUDENT_TABLE + " WHERE " + ID + "=" + studentModel.getId();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()) {
            return true;
        } else
            return false;
    }

    /**
     * Query the information in the database based on the student’s name and modify the age
     * @param name
     * @param age
     */
    public void edit0ne(String name,int age) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql="update STUDENT_TABLE set STUDENT_AGE='"+age+"' where STUDENT_NAME='"+name+"'";
        db.execSQL(sql);
    }
}
