package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Afastamento;
import com.devlayers.spring_dl_ponto.facades.AfastamentoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/afastamentos")
public class AfastamentoController {
    private AfastamentoFacade afastamentoFacade;

    @Autowired
    public AfastamentoController(AfastamentoFacade afastamentoFacade) {
        this.afastamentoFacade = afastamentoFacade;
    }

    @PostMapping("")
    public void cadastrarAfastamento(@RequestBody Afastamento afastamento) {
        this.afastamentoFacade.cadastrarAfastamento(afastamento);
    }

    @GetMapping("/{id}")
    public Afastamento buscarAfastamentoPorID(@PathVariable Long id) {
        return this.afastamentoFacade.buscarAfastamentoPorID(id);
    }

    @GetMapping("")
    public List<Afastamento> buscarAfastamentos() {
        return this.afastamentoFacade.buscarAfastamentos();
    }

    @PutMapping("/{id}")
    public void atualizarAfastamento(@PathVariable Long id, @RequestBody Afastamento afastamento) {
        this.afastamentoFacade.atualizarAfastamento(id, afastamento);
    }

    @DeleteMapping("{id}")
    public void apagarAfastamento(@PathVariable Long id) {
        this.afastamentoFacade.apagarAfastamento(id);
    }
}
