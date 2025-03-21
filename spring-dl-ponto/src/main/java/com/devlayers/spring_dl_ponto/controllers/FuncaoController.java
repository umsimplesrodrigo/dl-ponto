package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Empresa;
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
    public List<Funcao> get() {
        return funcaoFacade.search();
    }

    @GetMapping("/{id}")
    public Funcao getFuncoes(@PathVariable int id) {
        return funcaoFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody Funcao funcao) {
        funcaoFacade.cadastrar(funcao);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Funcao funcao) {
        funcaoFacade.atualizar(id, funcao);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        funcaoFacade.deletar(id);
    }
}
