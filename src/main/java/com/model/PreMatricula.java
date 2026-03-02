package com.model;

import java.util.UUID;

public class PreMatricula {
    private Integer matricula;
    private String turmaAno;

    public PreMatricula(Integer matricula, String turmaAno) {
        this.matricula = matricula;
        this.turmaAno = turmaAno;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getTurmaAno() {
        return turmaAno;
    }

    public void setTurmaAno(String turmaAno) {
        this.turmaAno = turmaAno;
    }

    public String toString() {
        return String.format("Matricula: %s\nTurma e Ano: %s\n", matricula, turmaAno);
    }
}
