package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaJpa extends JpaRepository<Empresa, Integer> {
}
