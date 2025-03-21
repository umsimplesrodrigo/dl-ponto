package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.HorarioApplication;
import com.devlayers.spring_dl_ponto.entities.Horario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HorarioFacade {
    private HorarioApplication horarioApplication;

    @Autowired
    public HorarioFacade(HorarioApplication horarioApplication) {
        this.horarioApplication = horarioApplication;
    }

    public void cadastrarHorario(Horario horario) {
        this.horarioApplication.cadastrarHorario(horario);
    }

    public Horario buscarHorarioPorID(Long id) {
        return this.horarioApplication.buscarHorarioPorID(id);
    }

    public List<Horario> buscarHorarios() {
        return this.horarioApplication.buscarHorarios();
    }

    public void atualizarHorario(Long id, Horario horario) {
        this.horarioApplication.atualizarHorario(id, horario);
    }

    public void apagarHorario(Long id) {
        this.horarioApplication.apagarHorario(id);
    }
}
