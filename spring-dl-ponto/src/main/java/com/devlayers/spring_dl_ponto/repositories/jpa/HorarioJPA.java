package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioJPA extends JpaRepository<Horario, Long> {
}
