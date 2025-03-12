package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.JustificativaApplication;
import com.devlayers.spring_dl_ponto.entities.Justificativas;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JustificativaFacade {
    private JustificativaApplication justificativasApplication;

    public JustificativaFacade(JustificativaApplication justificativasApplication) {
        this.justificativasApplication = justificativasApplication;
    }

    public void register(Justificativas justificativa) {
        this.justificativasApplication.register(justificativa);
    }

    public void update(int id, Justificativas justificativa) {
        this.justificativasApplication.update(id, justificativa);
    }

    public void remove(int id) {
        this.justificativasApplication.remove(id);
    }

    public List<Justificativas> search() {
        return this.justificativasApplication.search();
    }

    public Justificativas searchById(int id) {
        return this.justificativasApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.justificativasApplication.isEmpty();
    }
}
