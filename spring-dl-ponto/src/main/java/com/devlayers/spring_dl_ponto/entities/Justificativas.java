package com.devlayers.spring_dl_ponto.entities;

public class Justificativas {
    private Long id;
    private String nome;
    private String descricao;
    private boolean lancar_falta;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isLancar_falta() {
        return lancar_falta;
    }

    public void setLancar_falta(boolean lancar_falta) {
        this.lancar_falta = lancar_falta;
    }
}
