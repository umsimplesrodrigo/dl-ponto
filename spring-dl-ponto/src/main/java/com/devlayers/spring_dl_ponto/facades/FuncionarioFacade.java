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

    public void save(Funcionario funcionario) {
        this.funcionarioApplication.save(funcionario);
    }

    public Funcionario findById(Long id) {
        return funcionarioApplication.findById(id);
    }

    public List<Funcionario> findAll() {
        return funcionarioApplication.findAll();
    }

    public void updateFuncionario(Long id, Funcionario funcionario) {
        this.funcionarioApplication.updateFuncionario(id, funcionario);
    }

    public void deleteById(Long id) {
        this.funcionarioApplication.deleteById(id);
    }
}
