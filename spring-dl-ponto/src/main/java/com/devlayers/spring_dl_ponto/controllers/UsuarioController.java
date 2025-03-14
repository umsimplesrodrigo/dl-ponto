package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.facades.JustificativaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuariosController {
    private final UsuarioFacade usuarioFacade;

    @Autowired
    public UsuarioController(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    @GetMapping("")
    public List<Usuario> get() {
        return usuarioFacade.search();
    }

    @GetMapping("/{id}")
    public Usuarios getUsuario(@PathVariable int id) {
        return usuarioFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody Usuario usuario) {
        usuarioFacade.register(usuario);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Usuario usuario) { usuarioFacade.update(id, usuario); }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        usuarioFacade.remove(id);
    }
}
