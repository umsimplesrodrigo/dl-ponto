package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Empresas;
import com.devlayers.spring_dl_ponto.facades.EmpresaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    private final EmpresaFacade empresasFacade;

    @Autowired
    public EmpresaController(EmpresaFacade empresasFacade) {
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
