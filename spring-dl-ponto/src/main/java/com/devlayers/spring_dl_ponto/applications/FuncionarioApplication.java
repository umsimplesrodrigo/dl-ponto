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

    public void save(Funcionario funcionario) {
        this.funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Funcionario findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public void updateFuncionario(Long id, Funcionario funcionario) {
        this.funcionarioRepository.updateFuncionario(id, funcionario);
    }

    public void deleteById(Long id) {
        this.funcionarioRepository.deleteById(id);
    }
}
