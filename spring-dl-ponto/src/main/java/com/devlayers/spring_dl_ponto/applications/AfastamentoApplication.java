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

    public void cadastrarAfastamento(Afastamento afastamento) {
        this.afastamentoRepository.cadastrarAfastamento(afastamento);
    }

    public Afastamento buscarAfastamentoPorID(Long id) {
        return this.afastamentoRepository.buscarAfastamentoPorID(id);
    }

    public List<Afastamento> buscarAfastamentos() {
        return this.afastamentoRepository.buscarAfastamentos();
    }

    public void atualizarAfastamento(Long id, Afastamento afastamento) {
        this.afastamentoRepository.atualizarAfastamento(id, afastamento);
    }

    public void apagarAfastamento(Long id) {
        this.afastamentoRepository.apagarAfastamento(id);
    }
}
