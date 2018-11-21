package com.example.leal.evidencia2.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;

import com.example.leal.evidencia2.RecyclerViewActivity;
import com.example.leal.evidencia2.basedatos.usuarioContract;

import java.util.ArrayList;


public class usuario implements Parcelable {
    private static final Object SaveInArgsDB = ;
    private static final Object ContentValues = ;
    public String primapellido;
    public String segapellido;
    public String nombre;
    public String sexo;
    public String sexoo;
    public String fecha;
    public String entidad;
    private String path;

    public usuario() {
        this.primapellido = "";
        this.segapellido = "";
        this.nombre = "";
        this.sexo = "";
        this.sexoo = "";
        this.fecha = "0";
        this.entidad = "";
    }

    public static ArrayList<usuario> getCurps(RecyclerViewActivity recyclerViewActivity) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(primapellido);
        parcel.writeString(segapellido);
        parcel.writeString(nombre);
        parcel.writeString(sexo);
        parcel.writeString(sexoo);
        parcel.writeString(fecha);
        parcel.writeString(entidad);
        parcel.writeString(path);
    }

    public static final Parcelable.Creator<usuario> CREATOR
            = new Parcelable.Creator<usuario>() {
        public usuario createFromParcel(Parcel in) {
            return new usuario(in);
        }

        @Override
        public usuario[] newArray(int i) {
            return new usuario[i];
        }
    };

    private usuario(Parcel in) {
        this.primapellido = in.readString();
        this.segapellido = in.readString();
        this.nombre = in.readString();
        this.sexo = in.readString();
        this.sexoo = in.readString();
        this.fecha = in.readString();
        this.entidad = in.readString();
    }

    public static ArrayList<usuario> getUsuarios(Context context) {
        return null;
    }

    private static class ArgsDB {
        private Context context;
        private String selection;
        private String[] selectionArgs;
        private String sortOrder;

        public final String ASC = usuarioContract.usuarioEntry.COLUMNA_NOMBRE + " ASC";
        public final String DESC = usuarioContract.usuarioEntry.COLUMNA_NOMBRE + " DESC";

        public ArgsDB(Context context) {
            this.context = context;
            this.selection = "";
            String[] a = {};
            this.selectionArgs = a;
            this.sortOrder = this.ASC;

        }

        public Context getContext() {
            return context;
        }

        public String getSelection() {
            return selection;
        }

        public String[] getSelectionArgs() {
            return selectionArgs;
        }

        public String getSortOrder() {
            return sortOrder;
        }
    }


    private class SaveInArgsDB extends AsyncTask<SaveInArgsDB, Void, Void> {

        @Override
        protected Void doInBackground(SaveInArgsDB... saveInArgsDBS) {
            Context context = SaveInArgsDB[0].getContext();
            UsuarioHelper usuarioHelper = new UsuarioHelper(context);
            SQLiteDatabase db = usuarioHelper.getWritableDatabase();

            ContentValues = new ContentValues();
            values.put(usuarioContract.usuarioEntry.COLUMNA_NOMBRE, nombre);
            values.put(usuarioContract.usuarioEntry.COLUMNA_APELLIDOPAT,primapellido );
            values.put(usuarioContract.usuarioEntry.COLUMNA_APELLIDOMAT, segapellido);
            values.put(usuarioContract.usuarioEntry.COLUMNA_GENERO, sexo);
            values.put(usuarioContract.usuarioEntry.COLUMNA_ESTADO, entidad);
            values.put(usuarioContract.usuarioEntry.COLUMNA_YEAR, fecha);
            values.put(usuarioContract.usuarioEntry.COLUMNA_MES, fecha);
            values.put(usuarioContract.usuarioEntry.COLUMNA_DIA, fecha);
            values.put(usuarioContract.usuarioEntry.COLUMNA_PATH, path);

            if (id == 0){
                Long ids = db.insert(usuarioEntry.TABLE_NAME, usuarioEntry._ID, values);
                id = ids;
            } else {
                String[] selectionArgs = { String.valueOf(id) };
                db.update(usuarioEntry.TABLE_NAME, values, usuarioEntry._ID + " = ?", selectionArgs);
            }
            return null;
        }
    }

}

