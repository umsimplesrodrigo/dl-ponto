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

    @GetMapping("")
    public List<Funcionario> buscarFuncionarios() {
        return funcionarioFacade.buscarFuncionarios();
    }

    @GetMapping("/{id}")
    public Funcionario buscarFuncionarioPorID(@PathVariable Long id) {
        return funcionarioFacade.buscarFuncionarioPorID(id);
    }

    @PostMapping("")
    public void atualizarFuncionario(Funcionario funcionario) {
        this.funcionarioFacade.cadastrarFuncionario(funcionario);
    }

    @PutMapping("/{id}")
    public void atualizarFuncionario(@PathVariable Long id, Funcionario funcionario) {
        this.funcionarioFacade.atualizarFuncionario(id, funcionario);
    }

    @DeleteMapping("/{id}")
    public void apagarFuncionario(Long id) {
        this.funcionarioFacade.apagarFuncionario(id);
    }
}
