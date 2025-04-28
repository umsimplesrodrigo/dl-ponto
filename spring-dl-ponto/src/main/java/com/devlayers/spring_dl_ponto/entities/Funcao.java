package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "funcoes")
public class Funcao {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "funcao", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

    public Funcao() {
    }

    public Funcao(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Funcao{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
