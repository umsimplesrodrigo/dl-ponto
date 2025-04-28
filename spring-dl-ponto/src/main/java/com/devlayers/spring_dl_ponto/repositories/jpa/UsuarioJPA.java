package com.devlayers.spring_dl_ponto.repositories.jpa;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJPA extends JpaRepository<Usuario, Long> {
}
