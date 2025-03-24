package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Batida;
import com.devlayers.spring_dl_ponto.entities.Funcionario;
import com.devlayers.spring_dl_ponto.facades.BatidaFacade;
import com.devlayers.spring_dl_ponto.repositories.FuncionarioRepository;
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
    public List<Batida> buscarBatidas() {
        return batidaFacade.buscarBatidas();
    }

    @GetMapping("/{id}")
    public Batida buscarBatidaPorID(@PathVariable Long id) {
        return batidaFacade.buscarBatidaPorID(id);
    }

    @GetMapping("/{data}")
    public List<Batida> buscarBatidasPorData(@PathVariable LocalDate data){
        return batidaFacade.buscarBatidasPorData(data);
    }

    @PostMapping("")
    public void incluirBatida(@RequestBody Batida batida) {
        this.batidaFacade.incluirBatida(batida);
    }

    @PutMapping("/{id}")
    public void atualizarBatida(@PathVariable Long id, @RequestBody Batida batida) {
        this.batidaFacade.atualizarBatida(id, batida);
    }

    @DeleteMapping("/{id}")
    public void apagarBatida(@PathVariable Long id) {
        this.batidaFacade.apagarBatida(id);
    }
}
