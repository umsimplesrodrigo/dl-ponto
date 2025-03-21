package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "administrador")
    private boolean administrador;

    @Column(name = "senha")
    private String senha;

    @Column(name = "bloqueado")
    private boolean bloqueado;

    @Column(name = "desativado")
    private boolean desativado;

    @Column(name = "email")
    private String email;

    @Column(name = "ultimo_login")
    private LocalDateTime ultimoLogin;

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
        return ultimoLogin;
    }

    public void setUltimo_login(LocalDateTime ultimo_login) {
        this.ultimoLogin = ultimo_login;
    }
}
