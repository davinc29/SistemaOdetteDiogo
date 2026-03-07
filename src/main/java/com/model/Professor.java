package com.model;

import java.util.UUID;

public class Professor {
    private UUID id;
    private String nome;
    private String username;
    private String email;
    private String senha;

    public Professor(UUID id, String nome, String username, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
    }

    public Professor(String nome, String username, String email, String senha) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String toString() {
        return String.format("ID: %s\nNome: %s\nUsername: %s\nEmail: %s\nSenha: %s\n", id, nome, username, email, senha);
    }
}
