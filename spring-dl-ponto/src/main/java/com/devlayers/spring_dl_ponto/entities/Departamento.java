package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

    public Departamento() {
    }

    public Departamento(Long id, String descricao) {
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
        return "Departamento{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
