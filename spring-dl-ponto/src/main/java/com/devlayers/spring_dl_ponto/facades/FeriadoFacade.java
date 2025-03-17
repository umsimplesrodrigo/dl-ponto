package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.FeriadoApplication;
import com.devlayers.spring_dl_ponto.entities.Feriado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeriadoFacade {
    private FeriadoApplication feriadoApplication;

    @Autowired
    public FeriadoFacade(FeriadoApplication feriadoApplication) {
        this.feriadoApplication = feriadoApplication;
    }

    public void cadastrarFeriado(Feriado feriado) {
        this.feriadoApplication.cadastrarFeriado(feriado);
    }

    public Feriado buscarFeriadoPorID(Long id) {
        return this.feriadoApplication.buscarFeriadoPorID(id);
    }

    public List<Feriado> buscarFeriados() {
        return this.feriadoApplication.buscarFeriados();
    }

    public void atualizarFeriado(Long id, Feriado feriado) {
        this.feriadoApplication.atualizarFeriado(id, feriado);
    }

    public void apagarFeriado(Long id) {
        this.feriadoApplication.apagarFeriado(id);
    }
}
