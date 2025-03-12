package com.devlayers.spring_dl_ponto.entities;

public class FeriadosEmpresas {
    private Long id;
    private Feriados feriado;
    private Empresas empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Feriados getFeriado() {
        return feriado;
    }

    public void setFeriado(Feriados feriado) {
        this.feriado = feriado;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }
}
