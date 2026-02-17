package com.dto;

public class BoletimCadastroDTO {
    private Double nota1;
    private Double nota2;
    private String observacao;
    private String aluno;
    private String turmaAno;

    public BoletimCadastroDTO(Double nota1, Double nota2, String observacao, String aluno, String turmaAno) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.observacao = observacao;
        this.aluno = aluno;
        this.turmaAno = turmaAno;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getTurmaAno() {
        return turmaAno;
    }

    public void setTurmaAno(String turmaAno) {
        this.turmaAno = turmaAno;
    }

    @Override
    public String toString() {
        return "BoletimCadastroDTO{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", observacao='" + observacao + '\'' +
                ", aluno='" + aluno + '\'' +
                ", turmaAno='" + turmaAno + '\'' +
                '}';
    }
}
