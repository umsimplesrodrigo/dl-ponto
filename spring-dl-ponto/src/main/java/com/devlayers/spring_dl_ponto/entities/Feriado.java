package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "feriado")
public class Feriado {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data")
    private LocalDate data;

    @ManyToMany
    @JoinTable(
            name = "feriados_empresas",
            joinColumns = @JoinColumn(name = "feriado_id"),
            inverseJoinColumns = @JoinColumn(name = "empresa_id")
    )
    private List<Empresa> empresas = new ArrayList<>();

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
}
