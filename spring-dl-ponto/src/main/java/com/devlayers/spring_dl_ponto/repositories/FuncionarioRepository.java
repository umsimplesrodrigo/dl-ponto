package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Funcionario;
import com.devlayers.spring_dl_ponto.repositories.jpa.FuncionarioJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FuncionarioRepository {
    private final FuncionarioJPA funcionarioJPA;

    public FuncionarioRepository(FuncionarioJPA funcionarioJPA) {
        this.funcionarioJPA = funcionarioJPA;
    }

    public List<Funcionario> buscarFuncionarios() {
        return this.funcionarioJPA.findAll();
    }

    public Funcionario buscarFuncionarioPorID(Long id) {
        return this.funcionarioJPA.findById(id).orElse(null);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarioJPA.save(funcionario);
    }

    public void apagarFuncionario(Long id) {
        this.funcionarioJPA.deleteById(id);
    }

    public void editarFuncionario(Long id, Funcionario funcionario) {
        Funcionario funcionarioInDb = this.funcionarioJPA.findById(id).orElse(null);
        if (funcionarioInDb != null) {
            funcionarioInDb.setN_folha(funcionario.getN_folha());
            funcionarioInDb.setNome(funcionario.getNome());
            funcionarioInDb.setN_identificador(funcionario.getN_identificador());
            funcionarioInDb.setEmpresa(funcionario.getEmpresa());
            funcionarioInDb.setAdmissao(funcionario.getAdmissao());
            funcionarioInDb.setHorario(funcionario.getHorario());
            funcionarioInDb.setFuncao(funcionario.getFuncao());
            funcionarioInDb.setDepartamento(funcionario.getDepartamento());
            funcionarioInDb.setAdmissao(funcionario.getAdmissao());
            funcionarioInDb.setDemissao(funcionario.getDemissao());
            funcionarioInDb.setAfast_data_inicio(funcionario.getAfast_data_inicio());
            funcionarioInDb.setAfast_data_fim(funcionario.getAfast_data_fim());
            funcionarioInDb.setInvisivel(funcionario.isInvisivel());
            funcionarioInDb.setCpf(funcionario.getCpf());
            funcionarioInDb.setPis(funcionario.getPis());

            this.funcionarioJPA.save(funcionario);
        }
    }
}
