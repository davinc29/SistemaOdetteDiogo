package com.davinc.sistemaodettediogo.model;

import java.util.UUID;

public class Boletim {
    private UUID idBoletim;
    private Double nota1;
    private Double nota2;
    private Double media;
    private String observacoes;
    private Integer idAluno;
    private Integer idDisciplina;

    public Boletim(UUID idBoletim, Double nota1, Double nota2, Double media, String observacoes, Integer idAluno, Integer idDisciplina) {
        this.idBoletim = idBoletim;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.observacoes = observacoes;
        this.idAluno = idAluno;
        this.idDisciplina = idDisciplina;
    }

    public UUID getIdBoletim() {
        return idBoletim;
    }

    public void setIdBoletim(UUID idBoletim) {
        this.idBoletim = idBoletim;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String toString() {
        return String.format("ID Boletim: %s\nNota 1: %.2f\n Nota2: %.2f\nMédia: %.2f\nObservações: %s\nID Aluno: %d\nID Disciplina: %d\n", idBoletim, nota1, nota2, media, observacoes, idAluno, idDisciplina);
    }
}
