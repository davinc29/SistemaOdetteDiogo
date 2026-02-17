package com.dto;

public class BoletimViewDTO {
    private String matricula;
    private String nomeDisciplina;
    private Double nota1;
    private Double nota2;
    private Double media;
    private String situacao;
    private String observacoes;

    public BoletimViewDTO(String matricula, String nomeDisciplina, Double nota1, Double nota2, Double media, String situacao, String observacoes) {
        this.matricula = matricula;
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.situacao = situacao;
        this.observacoes = observacoes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "BoletimViewDTO{" +
                "matricula='" + matricula + '\'' +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", media=" + media +
                ", situacao='" + situacao + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}