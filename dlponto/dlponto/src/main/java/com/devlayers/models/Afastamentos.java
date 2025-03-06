package com.devlayers.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "afastamentos")
public class Afastamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionarios funcionario;

    @Column
    private LocalDate data_inicio;

    @Column
    private LocalDate data_fim;

    @ManyToOne
    @JoinColumn(name = "justificativas", nullable = false)
    private Justificativas justificativa;

    @Column
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
