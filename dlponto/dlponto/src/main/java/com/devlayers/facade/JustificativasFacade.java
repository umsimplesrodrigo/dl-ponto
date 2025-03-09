package com.devlayers.facade;

import com.devlayers.applications.JustificativasApplication;
import com.devlayers.models.Justificativas;

import java.util.List;

public class JustificativasFacade {
    private JustificativasApplication justificativasApplication;

    public JustificativasFacade(JustificativasApplication justificativasApplication) {
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
