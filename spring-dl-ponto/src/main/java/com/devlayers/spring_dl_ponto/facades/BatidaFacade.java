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

    public void save(Batida batida) {
        this.batidaApplication.save(batida);
    }

    public List<Batida> findAll() {
        return batidaApplication.findAll();
    }

    public Batida findById(Long id) {
        return batidaApplication.findById(id);
    }

    public List<Batida> findByData(LocalDate data) {
        return batidaApplication.findByData(data);
    }

    public void updateBatida(Long id, Batida batida) {
        this.batidaApplication.updateBatida(id, batida);
    }

    public void deleteById(Long id) {
        this.batidaApplication.deleteById(id);
    }
}
