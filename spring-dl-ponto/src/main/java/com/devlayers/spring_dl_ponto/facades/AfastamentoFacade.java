package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.AfastamentoApplication;
import com.devlayers.spring_dl_ponto.entities.Afastamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AfastamentoFacade {
    private AfastamentoApplication afastamentoApplication;

    @Autowired
    public AfastamentoFacade(AfastamentoApplication afastamentoApplication) {
        this.afastamentoApplication = afastamentoApplication;
    }

    public void cadastrarAfastamento(Afastamento afastamento) {
        this.afastamentoApplication.cadastrarAfastamento(afastamento);
    }

    public Afastamento buscarAfastamentoPorID(Long id) {
        return this.afastamentoApplication.buscarAfastamentoPorID(id);
    }

    public List<Afastamento> buscarAfastamentos() {
        return this.afastamentoApplication.buscarAfastamentos();
    }

    public void atualizarAfastamento(Long id, Afastamento afastamento) {
        this.afastamentoApplication.atualizarAfastamento(id, afastamento);
    }

    public void apagarAfastamento(Long id) {
        this.afastamentoApplication.apagarAfastamento(id);
    }
}
