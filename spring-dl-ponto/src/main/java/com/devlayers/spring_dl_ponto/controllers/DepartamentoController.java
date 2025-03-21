package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Departamento;
import com.devlayers.spring_dl_ponto.entities.Justificativa;
import com.devlayers.spring_dl_ponto.facades.DepartamentoFacade;
import com.devlayers.spring_dl_ponto.facades.JustificativaFacade;
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
    public void cadastrarDepartamentos(@RequestBody Departamento departamento) {
        this.departamentoFacade.cadastrarDepartamento(departamento);
    }

    @GetMapping("/{id}")
    public Departamento buscarDepartamentoPorID(@PathVariable Long id) {
        return this.departamentoFacade.buscarDepartamentoPorID(id);
    }

    @GetMapping("")
    public List<Departamento> buscarDepartamentos() {
        return this.departamentoFacade.buscarDepartamentos();
    }

    @PutMapping("/{id}")
    public void atualizarDepartamento(@PathVariable Long id, @RequestBody Departamento departamento) {
        this.departamentoFacade.atualizarDepartamento(id, departamento);
    }

    @DeleteMapping("/{id}")
    public void apagarDepartamento(@PathVariable Long id) {
        this.departamentoFacade.apagarDepartamento(id);
    }
}
