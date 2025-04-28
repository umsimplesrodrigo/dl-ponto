package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import com.devlayers.spring_dl_ponto.repositories.jpa.DepartamentoJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DepartamentoRepository {
    private final DepartamentoJPA departamentoJPA;

    public DepartamentoRepository(DepartamentoJPA departamentoJPA) {
        this.departamentoJPA = departamentoJPA;
    }

    public void save(Departamento departamento) {
        this.departamentoJPA.save(departamento);
    }

    public Departamento findById(Long id) {
        return this.departamentoJPA.findById(id).orElse(null);
    }

    public List<Departamento> findAll() {
        return this.departamentoJPA.findAll();
    }

    public void update(Long id, Departamento departamento) {
        Departamento departamentoInDb = this.departamentoJPA.findById(id).orElse(null);

        if (departamentoInDb != null) {
            departamentoInDb.setDescricao(departamento.getDescricao());
        }
    }

    public void deleteById(Long id) {
        this.departamentoJPA.deleteById(id);
    }
}
