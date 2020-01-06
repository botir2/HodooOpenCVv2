package com.ahqlab.hodooopencv.util;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.database.Cursor;
import android.graphics.Bitmap;

import java.util.List;

@Dao
public interface StandardHsvMapper  {

    String TABLE_NAME = " hsv ";

    @Insert()
    void insert(StandardHsv standardHsv);

    @Query("DELETE FROM hsv")
    void deleteAllNotes();


    String search_query = "SELECT * FROM "+ TABLE_NAME +" WHERE id=?";
    //@Query("SELECT * FROM "+ TABLE_NAME +" WHERE id = :id")
    //@Query(search_query)
    @Query("SELECT * FROM hsv ORDER BY priority DESC")
    List<StandardHsv> get(Integer id);

    Object gets(int i, int i1, int i2, int i3, int i4, int i5, int i6);

    Object  getss(String sg, String i, String i1, String i2, String i3, String i4, String i5, String i6);

    //StandardHsv get(Integer id);
    //LiveData<List<StandardHsv>> get(Integer id);

}