package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.JustificativaApplication;
import com.devlayers.spring_dl_ponto.entities.Justificativa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JustificativaFacade {
    private JustificativaApplication justificativasApplication;

    public JustificativaFacade(JustificativaApplication justificativasApplication) {
        this.justificativasApplication = justificativasApplication;
    }

    public void register(Justificativa justificativa) {
        this.justificativasApplication.register(justificativa);
    }

    public void update(int id, Justificativa justificativa) {
        this.justificativasApplication.update(id, justificativa);
    }

    public void remove(int id) {
        this.justificativasApplication.remove(id);
    }

    public List<Justificativa> search() {
        return this.justificativasApplication.search();
    }

    public Justificativa searchById(int id) {
        return this.justificativasApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.justificativasApplication.isEmpty();
    }
}
