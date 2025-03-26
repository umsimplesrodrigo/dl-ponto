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

    public void save(Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    public Departamento findById(Long id) {
        return departamentoRepository.findById(id);
    }

    public void update(Long id, Departamento departamento) {
        departamentoRepository.update(id, departamento);
    }

    public void deleteById(Long id) {
        departamentoRepository.deleteById(id);
    }
}
