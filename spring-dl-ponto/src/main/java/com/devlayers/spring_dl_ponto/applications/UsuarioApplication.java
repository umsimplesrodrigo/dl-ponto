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

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public void update(Long id, Usuario usuario) {
        this.usuarioRepository.update(id, usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
