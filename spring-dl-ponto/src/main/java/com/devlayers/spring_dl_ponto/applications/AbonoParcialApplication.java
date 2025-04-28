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

    public void save(AbonoParcial abonoParcial) {
        abonosParciaisRepository.save(abonoParcial);
    }

    public void update(Long id, AbonoParcial abonoParcial) {
        abonosParciaisRepository.upadateAbonoParcial(id, abonoParcial);
    }

    public void deleteById(Long id) {
        AbonoParcial abonoParcial = abonosParciaisRepository.findById(id);
        abonosParciaisRepository.deleteById(id);
    }

    public List<AbonoParcial> findAll() {
        return this.abonosParciaisRepository.findAll();
    }

    public AbonoParcial findById(Long id) {
        return this.abonosParciaisRepository.findById(id);
    }

}
