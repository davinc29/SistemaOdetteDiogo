package com.dto;

import java.util.UUID;

public class ProfessorDTO {
    private UUID id;
    private String nome;
    private String usuario;
    private String email;

    public ProfessorDTO(UUID id, String nome, String username, String email) {
        this.id = id;
        this.nome = nome;
        this.usuario = username;
        this.email = email;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", username='" + usuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
