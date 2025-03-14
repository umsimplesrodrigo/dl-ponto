package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.repositories.JustificativaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartamentoAplication {
    private DepartaamentoRepository departaamentoRepository;

    public DepartamentoAplication(DepartaamentoRepository departaamentoRepository) {
        this.departaamentoRepository = departaamentoRepository;
    }

    public void register(Departamento departamento) {
        departamentoRepository.registerDepartamento(departamento);
    }

    public void update(int id, Usuarios usuarios) {
        UsuarioRepository.updateUsuario(id, usuario);
    }

    public void remove(int id) {
        departamentoRepository.removeDepartamento(id);
    }

    public List<Departamento> search() {
        return departamentoRepository.searchDepartamento();
    }

    public Departamento searchById(int id) {
        return departamentoRepository.searchById(id);
    }

    public boolean isEmpty() {
        return departamentoRepository.isEmpty();
    }
}
