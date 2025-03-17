package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Usuario;
import com.devlayers.spring_dl_ponto.facades.UsuarioFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private UsuarioFacade usuarioFacade;

    @Autowired
    public UsuarioController(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    @PostMapping("")
    public void cadastrarUsuario(@RequestBody Usuario usuario) {
        this.usuarioFacade.cadastrarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorID(@PathVariable Long id) {
        return this.usuarioFacade.buscarUsuariosPorID(id);
    }

    @GetMapping("")
    public List<Usuario> buscarUsuarios() {
        return this.usuarioFacade.buscarUsuarios();
    }

    @PutMapping("/{id}")
    public void atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        this.usuarioFacade.atualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void apagarUsuario(@PathVariable Long id) {
        this.usuarioFacade.apagarUsuario(id);
    }
}
