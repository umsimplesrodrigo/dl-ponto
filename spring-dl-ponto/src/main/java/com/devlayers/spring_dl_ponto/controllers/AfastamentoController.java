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
    public void save(@RequestBody Afastamento afastamento) {
        this.afastamentoFacade.save(afastamento);
    }

    @GetMapping("/{id}")
    public Afastamento findById(@PathVariable Long id) {
        return this.afastamentoFacade.findById(id);
    }

    @GetMapping("")
    public List<Afastamento> findAll() {
        return this.afastamentoFacade.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Afastamento afastamento) {
        this.afastamentoFacade.update(id, afastamento);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        this.afastamentoFacade.deleteById(id);
    }
}
