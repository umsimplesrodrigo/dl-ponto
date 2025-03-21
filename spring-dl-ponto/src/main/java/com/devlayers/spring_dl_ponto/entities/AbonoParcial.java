package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "abonos-parciais")
public class AbonoParcial {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "hora_fim")
    private String horaFim;

    @ManyToOne
    @JoinColumn(name = "id_justificativa")
    private Justificativa justificativa;

    @Column(name = "tipo")
    private boolean tipo;

    public AbonoParcial() {
    }

    public AbonoParcial(Long id, Funcionario funcionario, LocalDate data, String horaInicio, String horaFim, Justificativa justificativa, boolean tipo) {
        this.id = id;
        this.funcionario = funcionario;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.justificativa = justificativa;
        this.tipo = tipo;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora_inicio() {
        return horaInicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.horaInicio = hora_inicio;
    }

    public String getHora_fim() {
        return horaFim;
    }

    public void setHora_fim(String hora_fim) {
        this.horaFim = hora_fim;
    }

    public Justificativa getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativa justificativa) {
        this.justificativa = justificativa;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
