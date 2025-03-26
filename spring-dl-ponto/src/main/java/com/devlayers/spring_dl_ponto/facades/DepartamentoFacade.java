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

    public void save(Departamento departamento) {
        this.departamentoApplication.save(departamento);
    }

    public List<Departamento> findAll() {
        return this.departamentoApplication.findAll();
    }

    public Departamento findById(Long id) {
        return this.departamentoApplication.findById(id);
    }

    public void update(Long id, Departamento departamento) {
        this.departamentoApplication.update(id, departamento);
    }

    public void deleteById(Long id) {
        this.departamentoApplication.deleteById(id);
    }
}
