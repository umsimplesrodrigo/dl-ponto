package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "justificativas")
public class Justificativa {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "lancar_falta")
    private boolean lancarFalta;

    public Justificativa() {
    }

    public Justificativa(String nome, String descricao, boolean lancarFalta) {
        this.nome = nome;
        this.descricao = descricao;
        this.lancarFalta = lancarFalta;
    }

    public Justificativa(Long id, String nome, String descricao, boolean lancarFalta) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.lancarFalta = lancarFalta;
    }

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
        return lancarFalta;
    }

    public void setLancar_falta(boolean lancar_falta) {
        this.lancarFalta = lancar_falta;
    }
}
