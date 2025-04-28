package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import com.devlayers.spring_dl_ponto.repositories.jpa.UsuarioJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UsuarioRepository {
    private final UsuarioJPA usuarioJPA;

    public UsuarioRepository(UsuarioJPA usuarioJPA) {
        this.usuarioJPA = usuarioJPA;
    }

    public void save(Usuario usuario) {
        this.usuarioJPA.save(usuario);
    }

    public Usuario findById(Long id) {
        return this.usuarioJPA.findById(id).orElse(null);
    }

    public List<Usuario> findAll() {
        return this.usuarioJPA.findAll();
    }

    public void update(Long id, Usuario usuario) {
        Usuario usuarioInDB = this.usuarioJPA.findById(id).orElse(null);

        if (usuarioInDB != null) {
            usuarioInDB.setNome(usuario.getNome());
            usuarioInDB.setAdministrador(usuario.isAdministrador());
            usuarioInDB.setSenha(usuario.getSenha());
            usuarioInDB.setSenha(usuario.getSenha());
            usuarioInDB.setBloqueado(usuario.isBloqueado());
            usuarioInDB.setDesativado(usuario.isDesativado());
            usuarioInDB.setEmail(usuario.getEmail());
            usuarioInDB.setUltimo_login(usuario.getUltimo_login());

            this.usuarioJPA.save(usuarioInDB);
        }
    }

    public void deleteById(Long id) {
        this.usuarioJPA.deleteById(id);
    }
}
