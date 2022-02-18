package com.colegio.dto;

import java.lang.reflect.Array;

public class Docente {



    private String Nombre;
    private int idProfesor;


    public Docente(int idProfesor, String nombre) {
        Nombre = nombre;
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }


}
