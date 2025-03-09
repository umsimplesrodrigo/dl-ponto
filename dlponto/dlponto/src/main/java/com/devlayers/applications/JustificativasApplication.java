package com.devlayers.applications;

import com.devlayers.models.Justificativas;
import com.devlayers.repositories.JustificativasRepository;

import java.util.List;

public class JustificativasApplication {
    private JustificativasRepository justificativasRepository;

    public JustificativasApplication(JustificativasRepository justificativasRepository) {
        this.justificativasRepository = justificativasRepository;
    }

    public void register(Justificativas justificativa) {
        justificativasRepository.addJustificativas(justificativa);
    }

    public void update(int id, Justificativas justificativa) {
        justificativasRepository.updateJustificativas(id, justificativa);
    }

    public void remove(int id) {
        justificativasRepository.removeJustificativas(id);
    }

    public List<Justificativas> search() {
        return justificativasRepository.searchJustificativas();
    }

    public Justificativas searchById(int id) {
        return justificativasRepository.searchById(id);
    }

    public boolean isEmpty() {
        return justificativasRepository.isEmpty();
    }
}
