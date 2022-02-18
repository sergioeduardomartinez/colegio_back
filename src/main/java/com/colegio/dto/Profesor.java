package com.colegio.dto;

import java.sql.Blob;

public class Profesor {

    private  String docente;
    private  String materia;
    private  String estudiante;
    private  String grado;
    private  String salon;

    public Profesor(String docente, String materia, String estudiante, String grado, String salon) {
        this.docente = docente;
        this.materia = materia;
        this.estudiante = estudiante;
        this.grado = grado;
        this.salon = salon;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
    
}
