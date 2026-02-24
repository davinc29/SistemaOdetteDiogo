package com.model;

import java.util.UUID;

public class Aluno {
    private UUID idAluno;
    private String nome;
    private Integer matricula;
    private String email;
    private String senha;

    public Aluno(UUID idAluno, String nome, Integer matricula, String email, String senha) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.senha = senha;
    }

    public UUID getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(UUID idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nNome: %s\nMatricula: %d\nEmail: %s\nSenha: %s\n", idAluno, nome, matricula, email, senha);
    }
}
