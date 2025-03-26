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

    public void save(Afastamento afastamento) {
        this.afastamentoApplication.save(afastamento);
    }

    public Afastamento findById(Long id) {
        return this.afastamentoApplication.findById(id);
    }

    public List<Afastamento> findAll() {
        return this.afastamentoApplication.findAll();
    }

    public void update(Long id, Afastamento afastamento) {
        this.afastamentoApplication.update(id, afastamento);
    }

    public void deleteById(Long id) {
        this.afastamentoApplication.deleteById(id);
    }
}
