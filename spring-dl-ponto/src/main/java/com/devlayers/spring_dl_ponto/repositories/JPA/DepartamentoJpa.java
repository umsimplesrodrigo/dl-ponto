package com.devlayers.spring_dl_ponto.repositories.JPA;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoJpa extends JpaRepository<Departamento, Integer> {
}