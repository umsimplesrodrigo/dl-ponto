package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Funcionario;
import com.devlayers.spring_dl_ponto.facades.FuncionarioFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    private FuncionarioFacade funcionarioFacade;

    @Autowired
    public FuncionarioController(FuncionarioFacade funcionarioFacade) {
        this.funcionarioFacade = funcionarioFacade;
    }

    @PostMapping("")
    public void save(@RequestBody Funcionario funcionario) {
        this.funcionarioFacade.save(funcionario);
    }

    @GetMapping("")
    public List<Funcionario> findAll() {
        return funcionarioFacade.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario findById(@PathVariable Long id) {
        return funcionarioFacade.findById(id);
    }

    @PutMapping("/{id}")
    public void updateFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        this.funcionarioFacade.updateFuncionario(id, funcionario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.funcionarioFacade.deleteById(id);
    }
}
