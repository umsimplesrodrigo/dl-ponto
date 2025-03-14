package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.JustificativaApplication;
import com.devlayers.spring_dl_ponto.entities.Justificativa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioFacade {
    private UsuariosApplication usuarioApplication;

    public UsuarioFacade(UsuarioApplication usuarioApplication) {
        this.usuarioApplication = usuarioApplication;
    }

    public void register(Usuario usuario) {
        this.usuarioApplication.register(usuario);
    }

    public void update(int id, Usuario usuario) {
        this.usuarioApplication.update(id, usuario);
    }

    public void remove(int id) {
        this.usuarioApplication.remove(id);
    }

    public List<Usuario> search() {
        return this.usuarioApplication.search();
    }

    public Usuario searchById(int id) {
        return this.usuarioApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.usuarioApplication.isEmpty();
    }
}
