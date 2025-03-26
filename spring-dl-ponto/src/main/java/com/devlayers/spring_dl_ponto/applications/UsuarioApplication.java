package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import com.devlayers.spring_dl_ponto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioApplication {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.cadastrarUsuario(usuario);
    }

    public void atualizarUsuario(Long id, Usuario usuario) {
        this.usuarioRepository.atualizarUsuario(id, usuario);
    }

    public void apagarUsuario(Long id) {
        usuarioRepository.apagarUsuario(id);
    }

    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.buscarUsuarios();
    }

    public Usuario buscarUsuarioPorID(Long id) {
        return usuarioRepository.buscarUsuarioPorID(id);
    }

    /*public boolean isEmpty() {
        return usuarioRepository.isEmpty();
    }*/
}
