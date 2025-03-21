package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.repositories.FuncaoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncaoApplication {
    private FuncaoRepository funcoesRepository;

    public FuncaoApplication(FuncaoRepository funcoesRepository) {
        this.funcoesRepository = funcoesRepository;
    }

    public void cadastrarFuncao(Funcao funcao) {
        funcoesRepository.addFuncao(funcao);
    }

    public void atualizar(int id, Funcao funcao) {
        funcoesRepository.updateFuncao(id, funcao);
    }

    public void deletar(int id) {
        Funcao funcao = funcoesRepository.buscarPorId(id);
        funcoesRepository.deletarFuncao(id);
    }

    public List<Funcao> search() {
        return this.funcoesRepository.buscarFuncoes();
    }

    public Funcao buscarPorId(int id) {
        return this.funcoesRepository.buscarPorId(id);
    }

    public boolean estaVazio() {
        return this.funcoesRepository.estaVazio();
    }
}
