package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "feriados_empresas")
public class FeriadoEmpresa {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empresa", referencedColumnName = "id", insertable = false, updatable = false)
    private Empresa empresa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_feriado", referencedColumnName = "id", insertable = false, updatable = false)
    private Feriado feriado;

    public FeriadoEmpresa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
