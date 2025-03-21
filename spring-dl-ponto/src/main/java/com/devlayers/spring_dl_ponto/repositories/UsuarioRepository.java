package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorID(Long id) {
        return this.usuarios
                .stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Usuario> buscarUsuarios() {
        return this.usuarios;
    }

    public void atualizarUsuario(Long id, Usuario usuario) {
        Usuario usuarioInMemory = this.buscarUsuarioPorID(id);

        usuarioInMemory.setNome(usuario.getNome());
        usuarioInMemory.setAdministrador(usuario.isAdministrador());
        usuarioInMemory.setSenha(usuario.getSenha());
        usuarioInMemory.setSenha(usuario.getSenha());
        usuarioInMemory.setBloqueado(usuario.isBloqueado());
        usuarioInMemory.setDesativado(usuario.isDesativado());
        usuarioInMemory.setEmail(usuario.getEmail());
        usuarioInMemory.setUltimo_login(usuario.getUltimo_login());
    }

    public void apagarUsuario(Long id) {
        this.usuarios.removeIf(u -> u.getId().equals(id));
    }
}
