package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.FuncionarioApplication;
import com.devlayers.spring_dl_ponto.entities.Funcionario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioFacade {
    private FuncionarioApplication funcionarioApplication;

    public FuncionarioFacade(FuncionarioApplication funcionarioApplication) {
        this.funcionarioApplication = funcionarioApplication;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarioApplication.cadastrarFuncionario(funcionario);
    }

    public void atualizarFuncionario(Long id, Funcionario funcionario) {
        this.funcionarioApplication.atualizarFuncionario(id, funcionario);
    }

    public void apagarFuncionario(Long id) {
        this.funcionarioApplication.apagarFuncionario(id);
    }

    public Funcionario buscarFuncionarioPorID(Long id) {
        return funcionarioApplication.buscarFuncionarioPorID(id);
    }

    public List<Funcionario> buscarFuncionarios() {
        return funcionarioApplication.buscarFuncionarios();
    }
}
