package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Funcionario;
import com.devlayers.spring_dl_ponto.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioApplication {
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioApplication(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarioRepository.cadastrarFuncionario(funcionario);
    }

    public void atualizarFuncionario(Long id, Funcionario funcionario) {
        this.funcionarioRepository.editarFuncionario(id, funcionario);
    }

    public void apagarFuncionario(Long id) {
        this.funcionarioRepository.apagarFuncionario(id);
    }

    public List<Funcionario> buscarFuncionarios() {
        return funcionarioRepository.buscarFuncionarios();
    }

    public Funcionario buscarFuncionarioPorID(Long id) {
        return funcionarioRepository.buscarFuncionarioPorID(id);
    }
}
