package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Batida;
import com.devlayers.spring_dl_ponto.repositories.BatidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class BatidaApplication {
    BatidaRepository batidaRepository;

    @Autowired
    public BatidaApplication(BatidaRepository batidaRepository) {
        this.batidaRepository = batidaRepository;
    }

    public void incluirBatida(Batida batida) { batidaRepository.addBatida(batida); }

    public void atualizarBatida(Long id, Batida batida) {
        batidaRepository.atualizarBatida(id, batida);
    }

    public void apagarBatida(Long id) {
        batidaRepository.apagarBatida(id);
    }

    public List<Batida> buscarBatidas() {
        return this.batidaRepository.buscar();
    }

    public Batida buscarBatidaPorID(Long id) {
        return this.batidaRepository.procurarPorID(id);
    }

    public List<Batida> buscarBatidaPorData(LocalDate data) {
        return this.batidaRepository.procurarPorData(data);
    }
}
