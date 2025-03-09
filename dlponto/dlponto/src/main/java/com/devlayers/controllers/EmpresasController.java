package com.devlayers.controllers;

import com.devlayers.facade.EmpresasFacade;
import com.devlayers.models.Empresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresasController {
    private final EmpresasFacade empresasFacade;

    @Autowired
    public EmpresasController(EmpresasFacade empresasFacade) {
        this.empresasFacade = empresasFacade;
    }

    @GetMapping("")
    public List<Empresas> get() {
        return empresasFacade.search();
    }

    @GetMapping("/{id}")
    public Empresas getEmpresas(@PathVariable int id) {
        return empresasFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody Empresas empresa) {
        empresasFacade.register(empresa);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Empresas empresa) {
        empresasFacade.update(id, empresa);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        empresasFacade.remove(id);
    }
}
