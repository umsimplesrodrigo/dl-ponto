package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Batida;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface BatidaJPA extends JpaRepository<Batida, Long> {
    List<Batida> findByData(LocalDate data);
}
