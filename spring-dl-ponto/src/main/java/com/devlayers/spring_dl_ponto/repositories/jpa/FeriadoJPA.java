package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Feriado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeriadoJPA extends JpaRepository<Feriado, Long> {
}
