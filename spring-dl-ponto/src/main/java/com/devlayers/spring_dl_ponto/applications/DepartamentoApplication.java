package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import com.devlayers.spring_dl_ponto.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartamentoApplication {
    private DepartamentoRepository departamentoRepository;

    @Autowired
    public DepartamentoApplication(DepartamentoRepository departaamentoRepository) {
        this.departamentoRepository = departaamentoRepository;
    }

    public void cadastrarDepartamento(Departamento departamento) {
        departamentoRepository.cadastrarDepartamento(departamento);
    }

    public void atualizarDepartamento(Long id, Departamento departamento) {
        departamentoRepository.atualizarDepartamento(id, departamento);
    }

    public void apagarDepartamento(Long id) {
        departamentoRepository.apagarDepartamento(id);
    }

    public List<Departamento> buscarDepartamentos() {
        return departamentoRepository.buscarDepartamentos();
    }

    public Departamento buscarDepartamentoPorID(Long id) {
        return departamentoRepository.buscarDepartamentoPorID(id);
    }

    /*public boolean isEmpty() {
        return departamentoRepository.isEmpty();
    }*/
}
