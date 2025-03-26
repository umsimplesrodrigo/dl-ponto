package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Horario;
import com.devlayers.spring_dl_ponto.repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HorarioApplication {
    HorarioRepository horarioRepository;

    @Autowired
    public HorarioApplication(HorarioRepository horarioRepository) {
        this.horarioRepository = horarioRepository;
    }

    public void save(Horario horario) {
        horarioRepository.save(horario);
    }

    public Horario findById(Long id) {
        return this.horarioRepository.findById(id);
    }

    public List<Horario> findAll() {
        return this.horarioRepository.findAll();
    }

    public void updateHorario(Long id, Horario horario) {
        this.horarioRepository.updateHorario(id, horario);
    }

    public void deleteById(Long id) {
        this.horarioRepository.deleteById(id);
    }
}
