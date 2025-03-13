package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.repositories.JustificativaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JustificativaApplication {
    private JustificativaRepository justificativaRepository;

    public JustificativaApplication(JustificativaRepository justificativaRepository) {
        this.justificativaRepository = justificativaRepository;
    }

    public void register(Justificativa justificativa) {
        justificativaRepository.addJustificativas(justificativa);
    }

    public void update(int id, Justificativa justificativa) {
        justificativaRepository.updateJustificativas(id, justificativa);
    }

    public void remove(int id) {
        justificativaRepository.removeJustificativas(id);
    }

    public List<Justificativa> search() {
        return justificativaRepository.searchJustificativas();
    }

    public Justificativa searchById(int id) {
        return justificativaRepository.searchById(id);
    }

    public boolean isEmpty() {
        return justificativaRepository.isEmpty();
    }
}
