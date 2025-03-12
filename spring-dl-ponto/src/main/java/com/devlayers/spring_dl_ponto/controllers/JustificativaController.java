package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Justificativas;
import com.devlayers.spring_dl_ponto.facades.JustificativaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/justificativas")
public class JustificativaController {
    private final JustificativaFacade justificativasFacade;

    @Autowired
    public JustificativaController(JustificativaFacade justificativasFacade) {
        this.justificativasFacade = justificativasFacade;
    }

    @GetMapping("")
    public List<Justificativas> get() {
        return justificativasFacade.search();
    }

    @GetMapping("/{id}")
    public Justificativas getJustificativas(@PathVariable int id) {
        return justificativasFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody Justificativas justificativa) {
        justificativasFacade.register(justificativa);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Justificativas justificativa) {
        justificativasFacade.update(id, justificativa);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        justificativasFacade.remove(id);
    }
}
