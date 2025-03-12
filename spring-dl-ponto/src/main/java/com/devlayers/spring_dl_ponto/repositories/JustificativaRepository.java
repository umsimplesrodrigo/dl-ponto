package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Justificativas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JustificativaRepository {
    public List<Justificativas> justificativas = new ArrayList<>();

    public Justificativas searchById(int id) {
        Justificativas justificativa = justificativas.stream().filter(p -> p.getId() == id).findFirst().get();

        return justificativa;
    }

    public List<Justificativas> searchJustificativas() {
        return justificativas;
    }

    public void addJustificativas(Justificativas justificativa) {
        justificativas.add(justificativa);
    }

    public void removeJustificativas(int id) {
        justificativas.removeIf(p -> p.getId() == id);
    }

    public void updateJustificativas(int id, Justificativas justificativa) {
        Justificativas justificativaInMemory = this.searchById(id);

        justificativaInMemory.setNome(justificativa.getNome());
        justificativaInMemory.setDescricao(justificativa.getDescricao());
        justificativaInMemory.setLancar_falta(justificativa.isLancar_falta());
    }

    public boolean isEmpty() {
        return justificativas.isEmpty();
    }
}
