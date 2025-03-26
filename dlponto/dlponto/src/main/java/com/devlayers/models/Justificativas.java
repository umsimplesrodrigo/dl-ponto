package com.devlayers.models;

import jakarta.persistence.*;

@Entity
@Table(name = "justificativas")
public class Justificativas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Boolean lancar_falta;

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

    public Boolean getLancar_falta() {
        return lancar_falta;
    }

    public void setLancar_falta(Boolean lancar_falta) {
        this.lancar_falta = lancar_falta;
    }
}
