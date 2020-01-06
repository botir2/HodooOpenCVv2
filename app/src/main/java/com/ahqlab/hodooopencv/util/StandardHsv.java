package com.ahqlab.hodooopencv.util;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import lombok.Data;

@Data
@Entity(tableName = "hsv")
public class StandardHsv {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String type;

    private String level1;

    private String level2;

    private String level3;

    private String level4;

    private String level5;

    private String level6;

    private String level7;

}
