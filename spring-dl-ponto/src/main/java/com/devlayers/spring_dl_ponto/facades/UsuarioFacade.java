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

    public void save(Usuario usuario) {
        this.usuarioApplication.save(usuario);
    }

    public List<Usuario> findAll() {
        return this.usuarioApplication.findAll();
    }

    public Usuario findById(Long id) {
        return this.usuarioApplication.findById(id);
    }

    public void update(Long id, Usuario usuario) {
        this.usuarioApplication.update(id, usuario);
    }

    public void deleteById(Long id) {
        this.usuarioApplication.deleteById(id);
    }
}
