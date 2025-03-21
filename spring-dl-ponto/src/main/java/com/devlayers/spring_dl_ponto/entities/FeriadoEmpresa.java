package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "feriados_empresas")
public class FeriadoEmpresa {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "feriados_empresas",
    joinColumns = @JoinColumn(name = "id_empresa"),
    inverseJoinColumns = @JoinColumn(name = "id_feriado"))
    private List<Feriado> feriado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Feriado> getFeriado() {
        return feriado;
    }

    public void setFeriado(List<Feriado> feriado) {
        this.feriado = feriado;
    }

    /*public List<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(List<Empresa> empresa) {
        this.empresa = empresa;
    }*/
}
