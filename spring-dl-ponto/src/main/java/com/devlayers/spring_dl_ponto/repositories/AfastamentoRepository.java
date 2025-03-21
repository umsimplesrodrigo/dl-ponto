package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Afastamento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AfastamentoRepository {
    private List<Afastamento> afastamentos = new ArrayList<>();

    public void cadastrarAfastamento(Afastamento afastamento) {
        this.afastamentos.add(afastamento);
    }

    public Afastamento buscarAfastamentoPorID(Long id) {
        return this.afastamentos
                .stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Afastamento> buscarAfastamentos() {
        return this.afastamentos;
    }

    public void atualizarAfastamento(Long id, Afastamento afastamento) {
        Afastamento afastamentoInMemory = this.buscarAfastamentoPorID(id);

        afastamentoInMemory.setFuncionario(afastamento.getFuncionario());
        afastamentoInMemory.setData_inicio(afastamento.getData_inicio());
        afastamentoInMemory.setData_fim(afastamento.getData_fim());
        afastamentoInMemory.setJustificativa(afastamento.getJustificativa());
        afastamentoInMemory.setObs(afastamento.getObs());
    }

    public void apagarAfastamento(Long id) {
        this.afastamentos.removeIf(a -> a.getId().equals(id));
    }
}
