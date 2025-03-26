package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.FuncaoApplication;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncaoFacade {
    private FuncaoApplication funcaoApplication;

    public FuncaoFacade(FuncaoApplication funcaoApplication) {
        this.funcaoApplication = funcaoApplication;
    }

    public void save(Funcao funcao) {
        this.funcaoApplication.save(funcao);
    }

    public void updateFuncao(Long id, Funcao funcao) {
        this.funcaoApplication.updateFuncao(id, funcao);
    }

    public void deleteById(Long id) {
        this.funcaoApplication.deleteById(id);
    }

    public List<Funcao> findAll() {
        return this.funcaoApplication.findAll();
    }

    public Funcao findById(Long id) {
        return this.funcaoApplication.findById(id);
    }
}
