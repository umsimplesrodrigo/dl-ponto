package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.FeriadoEmpresa;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.facades.FeriadoEmpresaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feriadosEmpresas")
public class FeriadoEmpresaController {

    private final FeriadoEmpresaFacade feriadoEmpresaFacade;

    @Autowired
    public FeriadoEmpresaController(FeriadoEmpresaFacade feriadoEmpresaFacade) {
        this.feriadoEmpresaFacade = feriadoEmpresaFacade;
    }

    @GetMapping("")
    public List<FeriadoEmpresa> get() {
        return feriadoEmpresaFacade.search();
    }

    @GetMapping("/{id}")
    public FeriadoEmpresa getFeriadosEmpresas(@PathVariable int id) {
        return feriadoEmpresaFacade.searchById(id);
    }

    @PostMapping("")
    public void register(@RequestBody FeriadoEmpresa feriadoEmpresa) {
        feriadoEmpresaFacade.cadastrar(feriadoEmpresa);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody FeriadoEmpresa feriadoEmpresa) {
        feriadoEmpresaFacade.atualizar(id, feriadoEmpresa);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        feriadoEmpresaFacade.deletar(id);
    }
}
