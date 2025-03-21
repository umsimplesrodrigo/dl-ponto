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

    public void cadastrarHorario(Horario horario) {
        horarioRepository.cadastrarHorario(horario);
    }

    public Horario buscarHorarioPorID(Long id) {
        return this.horarioRepository.buscarHorarioPorID(id);
    }

    public List<Horario> buscarHorarios() {
        return this.horarioRepository.buscarHorarios();
    }

    public void atualizarHorario(Long id, Horario horario) {
        this.horarioRepository.editarHorario(id, horario);
    }

    public void apagarHorario(Long id) {
        this.horarioRepository.apagarHorario(id);
    }
}
