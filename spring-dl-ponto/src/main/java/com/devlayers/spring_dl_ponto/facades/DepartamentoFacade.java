package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.JustificativaApplication;
import com.devlayers.spring_dl_ponto.entities.Justificativa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartamentoFacade {
    private DepartamentoApplication departamentoApplication;

    public DepartamentoFacade(DepartamentoApplication departamentoApplication) {
        this.departamentoApplication = departamentoApplication;
    }

    public void register(Departamento departamento) {
        this.departamentoApplication.register(departamento);
    }

    public void update(int id, Departamento departamento) {
        this.usuarioDepartamento.update(id, departamento);
    }

    public void remove(int id) {
        this.usuarioDepartamento.remove(id);
    }

    public List<Departamento> search() {
        return this.usuarioDepartamento.search();
    }

    public Departamento searchById(int id) {
        return this.usuarioDepartamento.searchById(id);
    }

    public boolean isEmpty() {
        return this.usuarioDepartamento.isEmpty();
    }
}
