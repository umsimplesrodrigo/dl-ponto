package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioJPA extends JpaRepository<Funcionario, Long> {
}
