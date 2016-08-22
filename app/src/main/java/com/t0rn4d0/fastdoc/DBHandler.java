package com.t0rn4d0.fastdoc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "doctorsManager";
    private static final String TABLE_DOCTOR="doctor";
    private static final String KEY_CITY="city";
    private static final String KEY_SPEC="spec";
    private static final String KEY_NAME="name";
    private static final String KEY_DEG="deg";
    private static final String KEY_ADDRESS="address";
    private static final String KEY_EXP="exp";
    private static final String KEY_PHONE="phone";


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String query= "CREATE TABLE " + TABLE_DOCTOR + " ("+KEY_CITY+" TEXT, "+KEY_SPEC+
                " TEXT, "+KEY_NAME+" TEXT, "+KEY_ADDRESS+" TEXT, "+KEY_EXP+" TEXT, "+KEY_DEG+" TEXT, "+KEY_PHONE+" TEXT PRIMARY KEY);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DOCTOR);
        onCreate(db);

    }

    public void addDoctor(Doctor doctor) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_CITY,doctor.getCity());
        values.put(KEY_SPEC,doctor.getSpec());
        values.put(KEY_NAME,doctor.getName());
        values.put(KEY_ADDRESS,doctor.getDeg());
        values.put(KEY_DEG,doctor.getAdd());
        values.put(KEY_EXP,doctor.getExp());
        values.put(KEY_PHONE,doctor.getPhone());

        db.insert(TABLE_DOCTOR, null, values);
        db.close();
    }

    public ArrayList<Doctor> getDoctors(String location, String speciality) {
        ArrayList<Doctor> doctorsList = new ArrayList<Doctor>();
        String selectQuery = "SELECT  * FROM " + TABLE_DOCTOR+" WHERE "+KEY_CITY+"='"+location+"' AND "+KEY_SPEC+"='"+speciality+"'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Doctor doctor = new Doctor(cursor.getString(0), cursor.getString(1), cursor.getString(2),
                        cursor.getString(3), cursor.getString(4),cursor.getString(5),cursor.getString(6));
                doctorsList.add(doctor);
            } while (cursor.moveToNext());
        }
        return doctorsList;
    }
}
