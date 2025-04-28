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

    public void save(Feriado feriado) {
        this.feriadoApplication.save(feriado);
    }

    public Feriado findById(Long id) {
        return this.feriadoApplication.findById(id);
    }

    public List<Feriado> findAll() {
        return this.feriadoApplication.findAll();
    }

    public void update(Long id, Feriado feriado) {
        this.feriadoApplication.update(id, feriado);
    }

    public void deleteById(Long id) {
        this.feriadoApplication.deleteById(id);
    }
}
