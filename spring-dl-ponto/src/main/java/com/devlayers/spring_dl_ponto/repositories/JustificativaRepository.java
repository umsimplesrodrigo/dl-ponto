package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.repositories.jpa.JustificativaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JustificativaRepository {
    private final JustificativaJpa justificativaJpa;

    @Autowired
    public JustificativaRepository(JustificativaJpa justificativaJpa) {
        this.justificativaJpa = justificativaJpa;
    }

    public Justificativa searchById(int id) {
        return this.justificativaJpa.findById(id).get();
    }

    public List<Justificativa> searchJustificativas() {
        return this.justificativaJpa.findAll();
    }

    public void addJustificativas(Justificativa justificativa) {
        this.justificativaJpa.save(justificativa);
    }

    public void removeJustificativas(int id) {
        this.justificativaJpa.deleteById(id);
    }

    public void updateJustificativas(int id, Justificativa justificativa) {
        Justificativa justificativaInDb = this.justificativaJpa.findById(id).get();

        justificativaInDb.setNome(justificativa.getNome());
        justificativaInDb.setDescricao(justificativa.getDescricao());
        justificativaInDb.setLancar_falta(justificativa.isLancar_falta());

        this.justificativaJpa.save(justificativaInDb);
    }

    public boolean isEmpty() {
        return false;
    }
}
