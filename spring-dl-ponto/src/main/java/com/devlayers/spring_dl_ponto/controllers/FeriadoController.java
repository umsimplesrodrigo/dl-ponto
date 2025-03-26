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
    public void save(@RequestBody Feriado feriado) {
        this.feriadoFacade.save(feriado);
    }

    @GetMapping("/{id}")
    public Feriado findById(@PathVariable Long id) {
        return this.feriadoFacade.findById(id);
    }

    @GetMapping("")
    public List<Feriado> findAll() {
        return this.feriadoFacade.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Feriado feriado) {
        this.feriadoFacade.update(id, feriado);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.feriadoFacade.deleteById(id);
    }
}
