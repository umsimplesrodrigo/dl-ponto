package com.devlayers.spring_dl_ponto.repositories.JPA;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpa extends JpaRepository<Usuario, Integer> {
}
