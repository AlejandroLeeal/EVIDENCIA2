package com.example.leal.evidencia2.models;

import android.os.Parcel;
import android.os.Parcelable;


public class usuario implements Parcelable {
    public String primapellido;
    public String segapellido;
    public String nombre;
    public String sexo;
    public String sexoo;
    public String fecha;
    public String entidad;

    public usuario(){
        this.primapellido="";
        this.segapellido="";
        this.nombre="";
        this.sexo="";
        this.sexoo="";
        this.fecha="0";
        this.entidad="";
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
    }
    public static final Parcelable.Creator<usuario> CREATOR
            = new Parcelable.Creator<usuario>(){
        public usuario createFromParcel(Parcel in) {
            return new usuario(in);
        }

        @Override
        public usuario[] newArray(int i) {
            return new usuario[i];
        }
    };

    private usuario(Parcel in){
        this.primapellido = in.readString();
        this.segapellido = in.readString();
        this.nombre = in.readString();
        this.sexo = in.readString();
        this.sexoo = in.readString();
        this.fecha = in.readString();
        this.entidad = in.readString();
    }
}
