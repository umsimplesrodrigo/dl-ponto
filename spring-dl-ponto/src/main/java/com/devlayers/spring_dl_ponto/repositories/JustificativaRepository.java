package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JustificativaRepository {
    public List<Justificativa> justificativas = new ArrayList<>();

    public Justificativa searchById(int id) {
        Justificativa justificativa = justificativas.stream().filter(p -> p.getId() == id).findFirst().get();

        return justificativa;
    }

    public List<Justificativa> searchJustificativas() {
        return justificativas;
    }

    public void addJustificativas(Justificativa justificativa) {
        justificativas.add(justificativa);
    }

    public void removeJustificativas(int id) {
        justificativas.removeIf(p -> p.getId() == id);
    }

    public void updateJustificativas(int id, Justificativa justificativa) {
        Justificativa justificativaInMemory = this.searchById(id);

        justificativaInMemory.setNome(justificativa.getNome());
        justificativaInMemory.setDescricao(justificativa.getDescricao());
        justificativaInMemory.setLancar_falta(justificativa.isLancar_falta());
    }

    public boolean isEmpty() {
        return justificativas.isEmpty();
    }
}
