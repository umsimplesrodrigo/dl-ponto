package com.devlayers.models;

import java.time.LocalDateTime;

public class Usuarios {
    private Long id;
    private String nome;
    private boolean administrador;
    private String senha;
    private boolean bloqueado;
    private boolean desativado;
    private String email;
    private LocalDateTime ultimo_login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean isDesativado() {
        return desativado;
    }

    public void setDesativado(boolean desativado) {
        this.desativado = desativado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getUltimo_login() {
        return ultimo_login;
    }

    public void setUltimo_login(LocalDateTime ultimo_login) {
        this.ultimo_login = ultimo_login;
    }
}
