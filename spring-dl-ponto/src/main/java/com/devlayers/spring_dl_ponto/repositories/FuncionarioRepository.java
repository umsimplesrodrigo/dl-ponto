package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Funcionario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FuncionarioRepository {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public List<Funcionario> buscarFuncionarios() {
        return funcionarios;
    }

    public Funcionario buscarFuncionarioPorID(Long id) {
        return funcionarios
                .stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void apagarFuncionario(Long id) {
        funcionarios.removeIf(f -> f.getId().equals(id));
    }

    public void editarFuncionario(Long id, Funcionario funcionario) {
        Funcionario funcionarioInMemory = this.buscarFuncionarioPorID(id);

        funcionarioInMemory.setN_folha(funcionario.getN_folha());
        funcionarioInMemory.setNome(funcionario.getNome());
        funcionarioInMemory.setN_identificador(funcionario.getN_identificador());
        funcionarioInMemory.setEmpresa(funcionario.getEmpresa());
        funcionarioInMemory.setAdmissao(funcionario.getAdmissao());
        funcionarioInMemory.setHorario(funcionario.getHorario());
        funcionarioInMemory.setFuncao(funcionario.getFuncao());
        funcionarioInMemory.setDepartamento(funcionario.getDepartamento());
        funcionarioInMemory.setAdmissao(funcionario.getAdmissao());
        funcionarioInMemory.setDemissao(funcionario.getDemissao());
        funcionarioInMemory.setAfast_data_inicio(funcionario.getAfast_data_inicio());
        funcionarioInMemory.setAfast_data_fim(funcionario.getAfast_data_fim());
        funcionarioInMemory.setInvisivel(funcionario.isInvisivel());
        funcionarioInMemory.setCpf(funcionario.getCpf());
        funcionarioInMemory.setPis(funcionario.getPis());
    }
}
