package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.facades.FuncaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/funcoes")
public class FuncaoController {

    private final FuncaoFacade funcaoFacade;

    @Autowired
    public FuncaoController(FuncaoFacade funcaoFacade) {
        this.funcaoFacade = funcaoFacade;
    }

    @GetMapping("")
    public List<Funcao> findAll() {
        return funcaoFacade.findAll();
    }

    @GetMapping("/{id}")
    public Funcao findById(@PathVariable Long id) {
        return funcaoFacade.findById(id);
    }

    @PostMapping("")
    public void save(@RequestBody Funcao funcao) {
        funcaoFacade.save(funcao);
    }

    @PutMapping("/{id}")
    public void updateFuncao(@PathVariable Long id, @RequestBody Funcao funcao) {
        funcaoFacade.updateFuncao(id, funcao);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        funcaoFacade.deleteById(id);
    }
}
