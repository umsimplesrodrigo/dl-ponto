package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import com.devlayers.spring_dl_ponto.facades.DepartamentoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {
    private final DepartamentoFacade departamentoFacade;

    @Autowired
    public DepartamentoController(DepartamentoFacade departamentoFacade) {
        this.departamentoFacade = departamentoFacade;
    }

    @PostMapping("")
    public void save(@RequestBody Departamento departamento) {
        this.departamentoFacade.save(departamento);
    }

    @GetMapping("/{id}")
    public Departamento findById(@PathVariable Long id) {
        return this.departamentoFacade.findById(id);
    }

    @GetMapping("")
    public List<Departamento> findAll() {
        return this.departamentoFacade.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Departamento departamento) {
        this.departamentoFacade.update(id, departamento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.departamentoFacade.deleteById(id);
    }
}
