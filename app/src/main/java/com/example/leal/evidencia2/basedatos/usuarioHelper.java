package com.example.leal.evidencia2.basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.leal.evidencia2.basedatos.usuarioContract.*;

public class usuarioHelper extends SQLiteOpenHelper {

    public static final int VERSION=1;
    public static final String BASE_DATOS = "usuarioDB.db";


    public usuarioHelper(Context context) {
        super(context,BASE_DATOS , null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL(SQL_CREAR_TABLA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(SQL_DELETE);
    onCreate(db);
    }
}
