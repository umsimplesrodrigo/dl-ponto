package com.devlayers.models;

import java.time.LocalDate;

public class Afastamentos {
    private Long id;
    private Funcionarios funcionario;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private Justificativas justificativa;
    private String obs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    public Justificativas getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativas justificativa) {
        this.justificativa = justificativa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
