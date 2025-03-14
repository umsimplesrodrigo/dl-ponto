package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Horario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HorarioRepository {
    private List<Horario> horarios = new ArrayList<>();

    public Horario buscarHorarioPorID(Long id) {
        return horarios
                .stream()
                .filter(h -> h.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Horario> buscarHorarios() {
        return horarios;
    }

    public void cadastrarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void apagarHorario(Long id) {
        horarios.removeIf(h -> h.getId().equals(id));
    }

    public void editarHorario(Long id, Horario horario) {
        Horario horarioInMemory = this.buscarHorarioPorID(id);

        horarioInMemory.setId(horario.getId());
        horarioInMemory.setDia_semana(horario.getDia_semana());
        horarioInMemory.setNome(horario.getNome());
        horarioInMemory.setEntrada1(horario.getEntrada1());
        horarioInMemory.setSaida1(horario.getSaida1());
        horarioInMemory.setEntrada2(horario.getEntrada2());
        horarioInMemory.setSaida2(horario.getSaida2());
        horarioInMemory.setEntrada3(horario.getEntrada3());
        horarioInMemory.setSaida3(horario.getSaida3());
        horarioInMemory.setEntrada4(horario.getEntrada4());
        horarioInMemory.setSaida4(horario.getSaida4());
        horarioInMemory.setEntrada5(horario.getEntrada5());
        horarioInMemory.setSaida5(horario.getSaida5());
    }
}
