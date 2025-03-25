package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.facades.AbonoParcialFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abonos-parciais")
public class AbonoParcialController {

    private final AbonoParcialFacade abonoParcialFacade;

    @Autowired
    public AbonoParcialController(AbonoParcialFacade abonoParcialFacade) {
        this.abonoParcialFacade = abonoParcialFacade;
    }

    @GetMapping("")
    public List<AbonoParcial> findAll() {
        return abonoParcialFacade.findAll();
    }

    @GetMapping("/{id}")
    public AbonoParcial findById(@PathVariable Long id) {
        return abonoParcialFacade.findById(id);
    }

    @PostMapping("")
    public void save(@RequestBody AbonoParcial abonoParcial) {
        abonoParcialFacade.save(abonoParcial);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody AbonoParcial abonoParcial) {
        abonoParcialFacade.update(id, abonoParcial);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        abonoParcialFacade.deleteById(id);
    }
}
