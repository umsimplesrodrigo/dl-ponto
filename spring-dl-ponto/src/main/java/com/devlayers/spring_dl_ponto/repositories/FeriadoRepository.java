package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Afastamento;
import com.devlayers.spring_dl_ponto.entities.Feriado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FeriadoRepository {
    private List<Feriado> feriados = new ArrayList<>();

    public void cadastrarFeriado(Feriado feriado){
        this.feriados.add(feriado);
    }

    public Feriado buscarFeriadoPorID(Long id) {
        return this.feriados
                .stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Feriado> buscarFeriados() {
        return this.feriados;
    }

    public void atualizarFeriado(Long id, Feriado feriado) {
        Feriado feriadoInMemory = this.buscarFeriadoPorID(id);

        feriadoInMemory.setDescricao(feriado.getDescricao());
        feriadoInMemory.setData(feriado.getData());
    }

    public void apagarFeriado(Long id) {
        this.feriados.removeIf(f -> f.getId().equals(id));
    }
}
