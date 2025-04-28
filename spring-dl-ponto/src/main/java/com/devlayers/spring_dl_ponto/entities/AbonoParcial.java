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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id", insertable = false, updatable = false)
    private Funcionario funcionario;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "hora_fim")
    private String horaFim;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_justificativa", referencedColumnName = "id", insertable = false, updatable = false)
    private Justificativa justificativa;

    @Column(name = "tipo")
    private boolean tipo;

    public AbonoParcial() {
    }

    public AbonoParcial(LocalDate data, String horaInicio, String horaFim, boolean tipo) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.tipo = tipo;
    }

    public AbonoParcial(Long id, LocalDate data, String horaInicio, String horaFim, boolean tipo) {
        this.id = id;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "AbonoParcial{" +
                "id=" + id +
                ", funcionario=" + funcionario +
                ", data=" + data +
                ", horaInicio='" + horaInicio + '\'' +
                ", horaFim='" + horaFim + '\'' +
                ", justificativa=" + justificativa +
                ", tipo=" + tipo +
                '}';
    }
}
