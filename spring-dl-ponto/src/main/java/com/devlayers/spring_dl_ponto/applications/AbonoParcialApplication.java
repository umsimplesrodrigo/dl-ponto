package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.repositories.AbonoParcialRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AbonoParcialApplication {
    private AbonoParcialRepository abonosParciaisRepository;

    public AbonoParcialApplication(AbonoParcialRepository abonosParciaisRepository) {
        this.abonosParciaisRepository = abonosParciaisRepository;
    }

    public void cadastrarAbonoParcial(AbonoParcial abonoParcial) {
        abonosParciaisRepository.addAbonoParcial(abonoParcial);
    }

    public void atualizar(int id, AbonoParcial abonoParcial) {
        abonosParciaisRepository.upadateAbonoParcial(id, abonoParcial);
    }

    public void deletar(int id) {
        AbonoParcial abonoParcial = abonosParciaisRepository.buscarPorId(id);
        abonosParciaisRepository.deletarAbonoParcial(id);
    }

    public List<AbonoParcial> search() {
        return this.abonosParciaisRepository.buscarAbonosParciais();
    }

    public AbonoParcial buscarPorId(int id) {
        return this.abonosParciaisRepository.buscarPorId(id);
    }

    public boolean estaVazio() {
        return this.abonosParciaisRepository.estaVazio();
    }
}
