package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.facades.JustificativaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class DepartamentoController {
    private final DepartamentoFacade departamentoFacade;

    @Autowired
    public DepartamentoController(DepartamentoFacade departamentoFacade) {
        this.departamentoFacade = departamentoFacade;
    }

    @GetMapping("")
    public List<Departamento> get() {
        return departamentoFacade.search();
    }

    @GetMapping("/{id}")
    public Departamento getDepartamento(@PathVariable int id) {
        return departamentoFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody Departamento departamento) {
        departamentoFacade.register(departamento);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Departamento departamento) { departamentoFacade.update(id, departamento); }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        departamentoFacade.remove(id);
    }
}
