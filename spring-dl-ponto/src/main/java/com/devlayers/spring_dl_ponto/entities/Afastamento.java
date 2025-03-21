package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "afastamentos")
public class Afastamento {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "id_justificativa")
    private Justificativa justificativa;

    @Column(name = "obs")
    private String obs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getData_inicio() {
        return dataInicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.dataInicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return dataFim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.dataFim = data_fim;
    }

    public Justificativa getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativa justificativa) {
        this.justificativa = justificativa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
