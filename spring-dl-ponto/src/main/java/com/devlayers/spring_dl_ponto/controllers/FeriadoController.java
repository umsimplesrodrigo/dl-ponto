package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Feriado;
import com.devlayers.spring_dl_ponto.facades.FeriadoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feriados")
public class FeriadoController {
    private FeriadoFacade feriadoFacade;

    @Autowired
    public FeriadoController(FeriadoFacade feriadoFacade) {
        this.feriadoFacade = feriadoFacade;
    }

    @PostMapping("")
    public void cadastrarFeriado(@RequestBody Feriado feriado) {
        this.feriadoFacade.cadastrarFeriado(feriado);
    }

    @GetMapping("/{id}")
    public Feriado buscarFeriadoPorID(@PathVariable Long id) {
        return this.feriadoFacade.buscarFeriadoPorID(id);
    }

    @GetMapping("")
    public List<Feriado> buscarFeriados() {
        return this.feriadoFacade.buscarFeriados();
    }

    @PutMapping("/{id}")
    public void atualizarFeriado(@PathVariable Long id, @RequestBody Feriado feriado) {
        this.feriadoFacade.atualizarFeriado(id, feriado);
    }

    @DeleteMapping("/{id}")
    public void apagarFeriado(@PathVariable Long id) {
        this.feriadoFacade.apagarFeriado(id);
    }
}
