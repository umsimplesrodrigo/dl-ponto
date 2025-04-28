package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Afastamento;
import com.devlayers.spring_dl_ponto.repositories.AfastamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AfastamentoApplication {
    private AfastamentoRepository afastamentoRepository;

    @Autowired
    public AfastamentoApplication(AfastamentoRepository afastamentoRepository) {
        this.afastamentoRepository = afastamentoRepository;
    }

    public void save(Afastamento afastamento) {
        this.afastamentoRepository.save(afastamento);
    }

    public Afastamento findById(Long id) {
        return this.afastamentoRepository.findById(id);
    }

    public List<Afastamento> findAll() {
        return this.afastamentoRepository.findAll();
    }

    public void update(Long id, Afastamento afastamento) {
        this.afastamentoRepository.update(id, afastamento);
    }

    public void deleteById(Long id) {
        this.afastamentoRepository.deleteById(id);
    }
}
