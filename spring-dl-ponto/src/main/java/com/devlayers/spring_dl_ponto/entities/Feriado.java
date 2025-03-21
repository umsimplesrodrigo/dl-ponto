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

    @ManyToMany
    @JoinTable(
            name = "empresa_feriado",
            joinColumns = @JoinColumn(name = "id_feriado"),
            inverseJoinColumns = @JoinColumn(name = "id_empresa")
    )

    private List<Empresa> empresas = new ArrayList<>();

    public Feriado() {}

    public Feriado(Long id, String descricao, LocalDate data, List<Empresa> empresas) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.empresas = empresas;
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

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
}