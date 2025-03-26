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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id")
    private Funcionario funcionario;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_justificativa", referencedColumnName = "id")
    private Justificativa justificativa;

    @Column(name = "observacao", length = 255)
    private String obs;

    public Afastamento() {}

    public Afastamento(Funcionario funcionario, LocalDate dataInicio, LocalDate dataFim, Justificativa justificativa, String obs) {
        this.funcionario = funcionario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.justificativa = justificativa;
        this.obs = obs;
    }

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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
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

    @Override
    public String toString() {
        return "Afastamento{" +
                "id=" + id +
                ", funcionario=" + funcionario +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", justificativa=" + justificativa +
                ", obs='" + obs + '\'' +
                '}';
    }
}