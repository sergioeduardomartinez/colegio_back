package com.colegio.dto;

import java.util.List;

public class Estudiante {
    private int idEStudiante;
    private String nombre;
    private List<Profesor> profesores;

    public int getIdEStudiante() {
        return idEStudiante;
    }

    public void setIdEStudiante(int idEStudiante) {
        this.idEStudiante = idEStudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
