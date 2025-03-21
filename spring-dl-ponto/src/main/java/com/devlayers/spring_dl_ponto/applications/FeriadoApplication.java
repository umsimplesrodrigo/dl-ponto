package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Feriado;
import com.devlayers.spring_dl_ponto.repositories.FeriadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeriadoApplication {
    private FeriadoRepository feriadoRepository;

    @Autowired
    public FeriadoApplication(FeriadoRepository feriadoRepository) {
        this.feriadoRepository = feriadoRepository;
    }

    public void cadastrarFeriado(Feriado feriado) {
        this.feriadoRepository.cadastrarFeriado(feriado);
    }

    public Feriado buscarFeriadoPorID(Long id) {
        return this.feriadoRepository.buscarFeriadoPorID(id);
    }

    public List<Feriado> buscarFeriados() {
        return this.feriadoRepository.buscarFeriados();
    }

    public void atualizarFeriado(Long id, Feriado feriado) {
        this.feriadoRepository.atualizarFeriado(id, feriado);
    }

    public void apagarFeriado(Long id) {
        this.feriadoRepository.apagarFeriado(id);
    }
}
