package com.model;

public class Disciplina {
    private Integer idDisciplina;
    private String nome;
    private Integer idProfessor;

    public Disciplina(Integer idDisciplina, String nome, Integer idProfessor) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.idProfessor = idProfessor;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String toString() {
        return String.format("ID Disciplina: %d\nNome: %s\nID Professor: %d\n", idDisciplina, nome, idProfessor);
    }
}
