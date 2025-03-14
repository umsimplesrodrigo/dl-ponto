package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.repositories.JustificativaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioApplication {
    private UsuarioRepository usuarioRepository;

    public UsuarioApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void register(Usuario Usuario) {
        usuarioRepository.registerUsuario(usuarios);
    }

    public void update(int id, Usuarios usuarios) {
        UsuarioRepository.updateUsuario(id, usuario);
    }

    public void remove(int id) {
        usuarioRepository.removeUsuario(id);
    }

    public List<Usuario> search() {
        return usuarioRepository.searchUsuario();
    }

    public Usuario searchById(int id) {
        return usuarioRepository.searchById(id);
    }

    public boolean isEmpty() {
        return usuarioRepository.isEmpty();
    }
}
