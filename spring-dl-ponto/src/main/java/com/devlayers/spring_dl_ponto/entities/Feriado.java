package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "feriados")
public class Feriado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;

    @Column(name = "data", nullable = false)
    private LocalDate data;

    @OneToMany(mappedBy = "feriado", cascade = CascadeType.ALL)
    private List<FeriadoEmpresa> feriadoEmpresas;

    public Feriado() {}

    public Feriado(Long id, String descricao, LocalDate data, List<Empresa> empresas) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<FeriadoEmpresa> getFeriadoEmpresas() {
        return feriadoEmpresas;
    }

    public void setFeriadoEmpresas(List<FeriadoEmpresa> feriadoEmpresas) {
        this.feriadoEmpresas = feriadoEmpresas;
    }

    @Override
    public String toString() {
        return "Feriado{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", feriadoEmpresas=" + feriadoEmpresas +
                '}';
    }
}