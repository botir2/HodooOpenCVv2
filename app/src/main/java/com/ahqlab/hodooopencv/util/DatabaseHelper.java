package com.ahqlab.hodooopencv.util;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static String TAG = ColorDetectorControllerForAndroid.class.getSimpleName();
    private static final String DATABASE_NAME = "ahqlab.db";

    private static final String TABLE_NAME = "hsv";

    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //Create database query
        db.execSQL("create table " + TABLE_NAME +" (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "type VARCHAR(60), level1 VARCHAR(60), level2 VARCHAR(60),level3 VARCHAR(60)," +
                "level4 VARCHAR(60),level5 VARCHAR(60),level6 VARCHAR(60),level7 VARCHAR(60))");

        //Insert query
        InserQueryDATA(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }



  /*  public int get(String id){

        Cursor cursor = getStandartData(id);
        if(cursor.getCount() == 0) {
            // show message
            Log.d(TAG, "Error Nothing found");
            return null;
        }

        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()) {
            buffer.append( cursor.getString(2));
            buffer.append( cursor.getString(3));
            buffer.append( cursor.getString(4));
            buffer.append( cursor.getString(5));
            buffer.append( cursor.getString(6));
            buffer.append( cursor.getString(7));
            buffer.append( cursor.getString(8));
        }

        return buffer.toString();
    }*/



    public Cursor getIdData(int id) {

        Log.d(TAG, "editData() called");

        SQLiteDatabase db = this.getReadableDatabase();
        String search_query = "SELECT * FROM "+ TABLE_NAME +" WHERE id=?";
        Cursor cursor = db.rawQuery(search_query, new String []{String.valueOf(id)});

        if(cursor == null)
        {
            Log.d(TAG, "cursor is NULL");
            return null;
        }
        return cursor;
    }


    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    private void InserQueryDATA(SQLiteDatabase db){

        //Insert query to SQLlite
        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (1, 'sg', '18/151/88', '35/98/72', '67/83/97', '84/112/100', '95/197/127', '97/175/162', '101/168/176');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (2, 'ph', '109/162/185', '100/131/189', '87/128/159', '57/57/131', '24/148/116', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (3, 'leu', '93/30/183', '100/25/181', '136/16/169', '158/52/160', '0/0/0', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (4, 'nit', '18/151/88', '108/23/180', '0/0/0', '0/0/0', '0/0/0','0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (5, 'pro', '90/186/173', '82/146/156', '70/94/138', '49/92/110', '0/0/0', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (6, 'glu', '90/180/173', '79/214/160', '73/165/155', '51/161/121', '32/176/66','0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (7, 'ket', '97/95/178', '121/57/165', '142/115/117', '159/129/76', '0/0/0', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (8, 'ubg', '108/45/173', '115/80/176', '115/104/178', '120/135/176', '121/155/165', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (9, 'bil', '96/100/168', '99/66/169', '107/103/162', '114/110/161', '0/0/0', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (10, 'ery', '93/254/171', '92/253/162', '90/252/147', '88/252/135', '73/248/106', '0/0/0', '0/0/0');");

        db.execSQL("INSERT INTO " + TABLE_NAME +" (id, type, level1, level2, level3, level4, level5, level6, level7)"
                + "VALUES (11, 'hb', '0/0/0', '88/254/143', '75/173/131', '63/123/106', '37/139/70', '0/0/0', '0/0/0');");
    }

}
