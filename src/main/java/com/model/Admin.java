package com.model;

import java.util.UUID;

public class Admin {
    private UUID idAdmin;
    private String email;
    private String senha;

    public Admin(UUID idAdmin, String email, String senha) {
        this.idAdmin = idAdmin;
        this.email = email;
        this.senha = senha;
    }

    public UUID getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(UUID idAdmin) {
        this.idAdmin = idAdmin;
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
        return String.format("ID Admin: %s\nEmail: %s\nSenha: %s\n", idAdmin, email, senha);
    }
}
