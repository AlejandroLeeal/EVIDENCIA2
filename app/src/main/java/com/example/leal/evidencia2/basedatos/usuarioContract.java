package com.example.leal.evidencia2.basedatos;

import android.provider.BaseColumns;

public class usuarioContract {

    public static final String SQL_CREAR_TABLA =
            "Create table "+ usuarioEntry.NOMBRE_TABLA + " {" +
                    usuarioEntry._ID + "Integer primary key, " +
                    usuarioEntry.COLUMNA_NOMBRE + " Text, " +
                    usuarioEntry.COLUMNA_APELLIDOPAT + " Text, " +
                    usuarioEntry.COLUMNA_APELLIDOMAT + "Text, " +
                    usuarioEntry.COLUMNA_GENERO + " Text, " +
                    usuarioEntry.COLUMNA_ESTADO + " Text, " +
                    usuarioEntry.COLUMNA_YEAR+ " Integer, " +
                    usuarioEntry.COLUMNA_MES+ " Integer, " +
                    usuarioEntry.COLUMNA_DIA+ " Integer, " +
                    usuarioEntry.COLUMNA_IMAGEN+ " Text)";

    public static final String SQL_DELETE ="drop table if exists " + usuarioEntry.NOMBRE_TABLA;


public static class usuarioEntry implements BaseColumns{
    public static final String NOMBRE_TABLA ="usuario";
    public static final String COLUMNA_NOMBRE = "nombre";
    public static final String COLUMNA_APELLIDOPAT= "apellidop";
    public static final String COLUMNA_APELLIDOMAT = "apellidom";
    public static final String COLUMNA_GENERO = "sexo";
    public static final String COLUMNA_ESTADO = "estado";
    public static final String COLUMNA_YEAR = "year";
    public static final String COLUMNA_MES = "mes";
    public static final String COLUMNA_DIA = "dia";
    public static final String COLUMNA_IMAGEN = "imagen";
    public static final String COLUMNA_PATH = "path";

}
}
