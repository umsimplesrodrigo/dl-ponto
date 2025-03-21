package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.FuncaoApplication;
import com.devlayers.spring_dl_ponto.entities.Empresa;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncaoFacade {
    private FuncaoApplication funcaoApplication;

    public FuncaoFacade(FuncaoApplication funcaoApplication) {
        this.funcaoApplication = funcaoApplication;
    }

    public void cadastrar(Funcao funcao) {
        this.funcaoApplication.cadastrarFuncao(funcao);
    }

    public void atualizar(int id, Funcao funcao) {
        this.funcaoApplication.atualizar(id, funcao);
    }

    public void deletar(int id) {
        this.funcaoApplication.deletar(id);
    }

    public List<Funcao> search() {
        return this.funcaoApplication.search();
    }

    public Funcao searchById(int id) {
        return this.funcaoApplication.buscarPorId(id);
    }

    public boolean isEmpty() {
        return this.funcaoApplication.estaVazio();
    }
}
