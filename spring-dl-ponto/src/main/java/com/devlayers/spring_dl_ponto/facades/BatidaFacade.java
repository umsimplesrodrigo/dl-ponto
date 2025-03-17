package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.BatidaApplication;
import com.devlayers.spring_dl_ponto.entities.Batida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BatidaFacade {
    private final BatidaApplication batidaApplication;

    @Autowired
    public BatidaFacade(BatidaApplication batidaApplication) {
        this.batidaApplication = batidaApplication;
    }

    public void incluirBatida(Batida batida) {
        this.batidaApplication.incluirBatida(batida);
    }

    public void atualizarBatida(Long id, Batida batida) {
        this.batidaApplication.atualizarBatida(id, batida);
    }

    public void apagarBatida(Long id) {
        this.batidaApplication.apagarBatida(id);
    }

    public List<Batida> buscarBatidas() {
        return batidaApplication.buscarBatidas();
    }

    public Batida buscarBatidaPorID(Long id) {
        return batidaApplication.buscarBatidaPorID(id);
    }

    public List<Batida> buscarBatidasPorData(LocalDate data) {
        return batidaApplication.buscarBatidaPorData(data);
    }
}
