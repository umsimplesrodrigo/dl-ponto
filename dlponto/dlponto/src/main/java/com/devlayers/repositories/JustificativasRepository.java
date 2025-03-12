package com.devlayers.repositories;

import com.devlayers.applications.JustificativasApplication;
import com.devlayers.models.Empresas;
import com.devlayers.models.Justificativas;

import java.util.ArrayList;
import java.util.List;

public class JustificativasRepository {
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
