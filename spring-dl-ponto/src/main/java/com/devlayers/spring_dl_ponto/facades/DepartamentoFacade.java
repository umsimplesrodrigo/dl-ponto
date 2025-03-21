package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.DepartamentoApplication;
import com.devlayers.spring_dl_ponto.entities.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartamentoFacade {
    private DepartamentoApplication departamentoApplication;

    @Autowired
    public DepartamentoFacade(DepartamentoApplication departamentoApplication) {
        this.departamentoApplication = departamentoApplication;
    }

    public void cadastrarDepartamento(Departamento departamento) {
        this.departamentoApplication.cadastrarDepartamento(departamento);
    }

    public void atualizarDepartamento(Long id, Departamento departamento) {
        this.departamentoApplication.atualizarDepartamento(id, departamento);
    }

    public void apagarDepartamento(Long id) {
        this.departamentoApplication.apagarDepartamento(id);
    }

    public List<Departamento> buscarDepartamentos() {
        return this.departamentoApplication.buscarDepartamentos();
    }

    public Departamento buscarDepartamentoPorID(Long id) {
        return this.departamentoApplication.buscarDepartamentoPorID(id);
    }

    /*public boolean isEmpty() {
        return this.usuarioDepartamento.isEmpty();
    }*/
}
