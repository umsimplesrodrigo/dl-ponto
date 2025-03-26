package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartamentoRepository {
    private List<Departamento> departamentos = new ArrayList<>();

    public void cadastrarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public Departamento buscarDepartamentoPorID(Long id) {
        return this.departamentos
                .stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Departamento> buscarDepartamentos() {
        return this.departamentos;
    }

    public void atualizarDepartamento(Long id, Departamento departamento) {
        Departamento departamentoInMemory = this.buscarDepartamentoPorID(id);

        departamentoInMemory.setDescricao(departamento.getDescricao());
    }

    public void apagarDepartamento(Long id) {
        this.departamentos.removeIf(d -> d.getId().equals(id));
    }
}
