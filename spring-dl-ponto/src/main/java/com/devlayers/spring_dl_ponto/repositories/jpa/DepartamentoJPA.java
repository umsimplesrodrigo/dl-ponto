package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoJPA extends JpaRepository<Departamento, Long> {
}
