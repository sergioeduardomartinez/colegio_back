package com.colegio.dto;

import java.util.List;

public class Curso {
    private String Salon;
    private List<Asignatura> asignaturaList;
    private int idCurso;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String salon) {
        Salon = salon;
    }

    public List<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }
}
