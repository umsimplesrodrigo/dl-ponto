package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Batida;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
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

    public void apagarBatida(Long id){
        batidas.removeIf(b -> b.getId().equals(id));
    }

    public void atualizarBatida(Long id, Batida batida) {
        Batida batidaInMemory = this.procurarPorID(id);

        batidaInMemory.setData(batida.getData());
        batidaInMemory.setFuncionario(batida.getFuncionario());
        batidaInMemory.setEntrada1(batida.getEntrada1());
        batidaInMemory.setSaida1(batida.getSaida1());
        batidaInMemory.setEntrada2(batida.getEntrada2());
        batidaInMemory.setSaida2(batida.getSaida2());
        batidaInMemory.setEntrada3(batida.getEntrada3());
        batidaInMemory.setSaida3(batida.getSaida3());
        batidaInMemory.setEntrada4(batida.getEntrada4());
        batidaInMemory.setSaida4(batida.getSaida4());
        batidaInMemory.setEntrada5(batida.getEntrada5());
        batidaInMemory.setSaida5(batida.getSaida5());
        batidaInMemory.setAjuste(batida.getAjuste());
        batidaInMemory.setHorario_num(batida.getHorario_num());
        batidaInMemory.setBac_entrada1(batida.getBac_entrada1());
        batidaInMemory.setBac_saida1(batida.getBac_saida1());
        batidaInMemory.setBac_entrada2(batida.getBac_entrada2());
        batidaInMemory.setBac_saida2(batida.getBac_saida2());
        batidaInMemory.setBac_entrada3(batida.getBac_entrada3());
        batidaInMemory.setBac_saida3(batida.getBac_saida3());
        batidaInMemory.setBac_entrada4(batida.getBac_entrada4());
        batidaInMemory.setBac_saida4(batida.getBac_saida4());
        batidaInMemory.setBac_entrada5(batida.getBac_entrada5());
        batidaInMemory.setBac_saida5(batida.getBac_saida5());
    }

}
