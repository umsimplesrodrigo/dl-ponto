package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.facades.AbonoParcialFacade;
import com.devlayers.spring_dl_ponto.facades.FuncaoFacade;
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
    public List<AbonoParcial> get() {
        return abonoParcialFacade.search();
    }

    @GetMapping("/{id}")
    public AbonoParcial getAbonosParciais(@PathVariable int id) {
        return abonoParcialFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody AbonoParcial abonoParcial) {
        abonoParcialFacade.cadastrar(abonoParcial);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody AbonoParcial abonoParcial) {
        abonoParcialFacade.atualizar(id, abonoParcial);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        abonoParcialFacade.deletar(id);
    }
}
