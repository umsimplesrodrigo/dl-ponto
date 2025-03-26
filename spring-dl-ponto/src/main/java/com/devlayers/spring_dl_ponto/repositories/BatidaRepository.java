package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Batida;
import com.devlayers.spring_dl_ponto.repositories.jpa.BatidaJPA;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public class BatidaRepository {
    private final BatidaJPA batidaJPA;

    public BatidaRepository(BatidaJPA batidaJPA) {
        this.batidaJPA = batidaJPA;
    }

    public void save(Batida batida) {
        this.batidaJPA.save(batida);
    }

    public Batida findById(Long id) {
        return this.batidaJPA.findById(id).orElse(null);
    }

    public List<Batida> findByData(LocalDate data) {
        return this.batidaJPA.findByData(data);
    }

    public List<Batida> findAll(){
        return this.batidaJPA.findAll();
    }

    public void deleteById(Long id){
        this.batidaJPA.deleteById(id);
    }

    public void updateBatida(Long id, Batida batida) {
        Batida batidaInDb = this.batidaJPA.findById(id).orElse(null);

        if (batidaInDb != null) {
            batidaInDb.setData(batida.getData());
            batidaInDb.setFuncionario(batida.getFuncionario());
            batidaInDb.setEntrada1(batida.getEntrada1());
            batidaInDb.setSaida1(batida.getSaida1());
            batidaInDb.setEntrada2(batida.getEntrada2());
            batidaInDb.setSaida2(batida.getSaida2());
            batidaInDb.setEntrada3(batida.getEntrada3());
            batidaInDb.setSaida3(batida.getSaida3());
            batidaInDb.setEntrada4(batida.getEntrada4());
            batidaInDb.setSaida4(batida.getSaida4());
            batidaInDb.setEntrada5(batida.getEntrada5());
            batidaInDb.setSaida5(batida.getSaida5());
            batidaInDb.setAjuste(batida.getAjuste());
            batidaInDb.setHorario_num(batida.getHorario_num());
            batidaInDb.setFolga(batida.isFolga());
            batidaInDb.setBac_entrada1(batida.getBac_entrada1());
            batidaInDb.setBac_saida1(batida.getBac_saida1());
            batidaInDb.setBac_entrada2(batida.getBac_entrada2());
            batidaInDb.setBac_saida2(batida.getBac_saida2());
            batidaInDb.setBac_entrada3(batida.getBac_entrada3());
            batidaInDb.setBac_saida3(batida.getBac_saida3());
            batidaInDb.setBac_entrada4(batida.getBac_entrada4());
            batidaInDb.setBac_saida4(batida.getBac_saida4());
            batidaInDb.setBac_entrada5(batida.getBac_entrada5());
            batidaInDb.setBac_saida5(batida.getBac_saida5());

            this.batidaJPA.save(batidaInDb);
        }
    }
}
