package com.model;

import java.util.UUID;

public class PreMatricula {
    private Integer idMatricula;
    private String matricula;

    public PreMatricula(Integer idMatricula, String matricula) {
        this.idMatricula = idMatricula;
        this.matricula = matricula;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return String.format("ID Matricula: %d\nMatricula: %s");
    }
}
