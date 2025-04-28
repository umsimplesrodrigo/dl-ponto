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

    public void save(Horario horario) {
        this.horarioApplication.save(horario);
    }

    public Horario findById(Long id) {
        return this.horarioApplication.findById(id);
    }

    public List<Horario> findAll() {
        return this.horarioApplication.findAll();
    }

    public void updateHorario(Long id, Horario horario) {
        this.horarioApplication.updateHorario(id, horario);
    }

    public void deleteById(Long id) {
        this.horarioApplication.deleteById(id);
    }
}
