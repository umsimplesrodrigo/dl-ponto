package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Batida;
import com.devlayers.spring_dl_ponto.facades.BatidaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/batidas")
public class BatidaController {
    private BatidaFacade batidaFacade;

    @Autowired
    public BatidaController(BatidaFacade batidaFacade) {
        this.batidaFacade = batidaFacade;
    }

    @GetMapping("")
    public List<Batida> findAll() {
        return batidaFacade.findAll();
    }

    @GetMapping("/{id}")
    public Batida findById(@PathVariable Long id) {
        return batidaFacade.findById(id);
    }

    @GetMapping("/{data}")
    public List<Batida> findByData(@PathVariable LocalDate data){
        return batidaFacade.findByData(data);
    }

    @PostMapping("")
    public void save(@RequestBody Batida batida) {
        this.batidaFacade.save(batida);
    }

    @PutMapping("/{id}")
    public void updateBatida(@PathVariable Long id, @RequestBody Batida batida) {
        this.batidaFacade.updateBatida(id, batida);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.batidaFacade.deleteById(id);
    }
}
