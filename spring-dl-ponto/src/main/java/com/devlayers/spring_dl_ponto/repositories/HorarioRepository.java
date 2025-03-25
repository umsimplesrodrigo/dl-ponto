package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Horario;
import com.devlayers.spring_dl_ponto.repositories.jpa.HorarioJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class HorarioRepository {
    private final HorarioJPA horarioJPA;

    public HorarioRepository(HorarioJPA horarioJPA) {
        this.horarioJPA = horarioJPA;
    }

    public Horario findById(Long id) {
        return this.horarioJPA.findById(id).orElse(null);
    }

    public List<Horario> findAll() {
        return this.horarioJPA.findAll();
    }

    public void save(Horario horario) {
        this.horarioJPA.save(horario);
    }

    public void deleteById(Long id) {
        this.horarioJPA.deleteById(id);
    }

    public void updateHorario(Long id, Horario horario) {
        Horario horarioInDb = this.horarioJPA.findById(id).orElse(null);
        if (horarioInDb != null) {
            horarioInDb.setDia_semana(horario.getDia_semana());
            horarioInDb.setNome(horario.getNome());
            horarioInDb.setEntrada1(horario.getEntrada1());
            horarioInDb.setSaida1(horario.getSaida1());
            horarioInDb.setEntrada2(horario.getEntrada2());
            horarioInDb.setSaida2(horario.getSaida2());
            horarioInDb.setEntrada3(horario.getEntrada3());
            horarioInDb.setSaida3(horario.getSaida3());
            horarioInDb.setEntrada4(horario.getEntrada4());
            horarioInDb.setSaida4(horario.getSaida4());
            horarioInDb.setEntrada5(horario.getEntrada5());
            horarioInDb.setSaida5(horario.getSaida5());
            horarioInDb.setExtra(horario.isExtra());
            horarioInDb.setCompensado(horario.isCompensado());
            horarioInDb.setCarga_diaria(horario.isCarga_diaria());
            horarioInDb.setNeutro(horario.isNeutro());
            horarioInDb.setCarga(horario.getCarga());

            this.horarioJPA.save(horarioInDb);
        }
    }
}
