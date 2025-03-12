package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Batidas;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BatidaRepository {
    private List<Batidas> batidas = new ArrayList<>();

    public Batidas procurarPorID(Long id) {
        return batidas
                .stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Batidas> procurarPorData(LocalDate data) {
        return batidas
                .stream()
                .filter(b -> b.getData().equals(data))
                .collect(Collectors.toList());
    }

    public List<Batidas> buscar(){ return batidas; }

    public void addBatida(Batidas batida) { batidas.add(batida); }

    public void apagarBatida(Long id, String motivo){
        // Vou resolver o problema nas regras de negócio, afinal o campo motivo não está na entidade
    }

    public void atualizarBatida(Long id, Batidas batida) {
        Batidas batidaInMemory = this.procurarPorID(id);

        // Também vou ter que pensar numa solução pra essa bagaça. Qual batida que vou editar no banco? 1,2,3..5?
    }

}
