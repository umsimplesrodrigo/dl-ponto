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
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id", insertable = false, updatable = false)
    private Funcionario funcionario;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_justificativa", referencedColumnName = "id", insertable = false, updatable = false)
    private Justificativa justificativa;

    @Column(name = "observacao", length = 255)
    private String obs;

    public Afastamento() {}

    public Afastamento(Long id, LocalDate dataInicio, LocalDate dataFim, String obs) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.obs = obs;
    }

    public Afastamento(LocalDate dataInicio, LocalDate dataFim, String obs) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.obs = obs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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