package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FuncaoRepository {
    private List<Funcao> funcoes = new ArrayList<>();

    public Funcao buscarPorId(int id) {
        Funcao funcao = funcoes.stream().filter(p -> p.getId() == id).findFirst().get();

        return funcao;
    }

    public List<Funcao> buscarFuncoes() {
        return funcoes;
    }

    public void addFuncao(Funcao funcao) {
        funcoes.add(funcao);
    }

    public void deletarFuncao(int id) {
        funcoes.removeIf(p -> p.getId() == id);
    }

    public void updateFuncao(int id, Funcao funcao) {
        Funcao funcaoInMemory = this.buscarPorId(id);

        funcaoInMemory.setDescricao(funcao.getDescricao());
    }

    public boolean estaVazio() {
        return funcoes.isEmpty();
    }
}
