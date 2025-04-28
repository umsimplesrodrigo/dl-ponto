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
    public void save(@RequestBody Usuario usuario) {
        this.usuarioFacade.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Long id) {
        return this.usuarioFacade.findById(id);
    }

    @GetMapping("")
    public List<Usuario> findAll() {
        return this.usuarioFacade.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Usuario usuario) {
        this.usuarioFacade.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.usuarioFacade.deleteById(id);
    }
}
