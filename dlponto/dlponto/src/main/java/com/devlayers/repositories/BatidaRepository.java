package com.devlayers.repositories;

import com.devlayers.models.Batida;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BatidaRepository {
    private List<Batida> batidas = new ArrayList<>();

    public Batida procurarPorID(Long id) {
        return batidas
                .stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Batida> procurarPorData(LocalDate data) {
        return batidas
                .stream()
                .filter(b -> b.getData().equals(data))
                .collect(Collectors.toList());
    }

    public List<Batida> buscar(){ return batidas; }

    public void addBatida(Batida batida) { batidas.add(batida); }

    public void apagarBatida(Long id, String motivo){
        // Vou resolver o problema nas regras de negócio, afinal o campo motivo não está na entidade
    }

    public void atualizarBatida(Long id, Batida batida) {
        Batida batidaInMemory = this.procurarPorID(id);

        // Também vou ter que pensar numa solução pra essa bagaça. Qual batida que vou editar no banco? 1,2,3..5?
    }

}
