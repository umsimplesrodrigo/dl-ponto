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

    public void save(Feriado feriado) {
        this.feriadoRepository.save(feriado);
    }

    public Feriado findById(Long id) {
        return this.feriadoRepository.findById(id);
    }

    public List<Feriado> findAll() {
        return this.feriadoRepository.findAll();
    }

    public void update(Long id, Feriado feriado) {
        this.feriadoRepository.update(id, feriado);
    }

    public void deleteById(Long id) {
        this.feriadoRepository.deleteById(id);
    }
}
