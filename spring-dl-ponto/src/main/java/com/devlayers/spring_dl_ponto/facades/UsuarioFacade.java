package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.UsuarioApplication;
import com.devlayers.spring_dl_ponto.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioFacade {
    private UsuarioApplication usuarioApplication;

    @Autowired
    public UsuarioFacade(UsuarioApplication usuarioApplication) {
        this.usuarioApplication = usuarioApplication;
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarioApplication.cadastrarUsuario(usuario);
    }

    public void atualizarUsuario(Long id, Usuario usuario) {
        this.usuarioApplication.atualizarUsuario(id, usuario);
    }

    public void apagarUsuario(Long id) {
        this.usuarioApplication.apagarUsuario(id);
    }

    public List<Usuario> buscarUsuarios() {
        return this.usuarioApplication.buscarUsuarios();
    }

    public Usuario buscarUsuariosPorID(Long id) {
        return this.usuarioApplication.buscarUsuarioPorID(id);
    }

    /*public boolean isEmpty() {
        return this.usuarioApplication.isEmpty();
    }*/
}
