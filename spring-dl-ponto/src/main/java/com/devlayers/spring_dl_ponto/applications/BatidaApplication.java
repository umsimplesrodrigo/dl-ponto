package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Batida;
import com.devlayers.spring_dl_ponto.repositories.BatidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BatidaApplication {
    BatidaRepository batidaRepository;

    @Autowired
    public BatidaApplication(BatidaRepository batidaRepository) {
        this.batidaRepository = batidaRepository;
    }

    public void save(Batida batida) { batidaRepository.save(batida); }

    public List<Batida> findAll() {
        return this.batidaRepository.findAll();
    }

    public Batida findById(Long id) {
        return this.batidaRepository.findById(id);
    }

    public List<Batida> findByData(LocalDate data) {
        return this.batidaRepository.findByData(data);
    }

    public void updateBatida(Long id, Batida batida) {
        batidaRepository.updateBatida(id, batida);
    }

    public void deleteById(Long id) {
        batidaRepository.deleteById(id);
    }
}
