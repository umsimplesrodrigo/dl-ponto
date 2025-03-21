package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.AbonoParcialApplication;
import com.devlayers.spring_dl_ponto.applications.FuncaoApplication;
import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AbonoParcialFacade {

    private AbonoParcialApplication abonoParcialApplication;

    public AbonoParcialFacade(AbonoParcialApplication abonoParcialApplication) {
        this.abonoParcialApplication = abonoParcialApplication;
    }

    public void cadastrar(AbonoParcial abonoParcial) {
        this.abonoParcialApplication.cadastrarAbonoParcial(abonoParcial);
    }

    public void atualizar(int id, AbonoParcial abonoParcial) {
        this.abonoParcialApplication.atualizar(id, abonoParcial);
    }

    public void deletar(int id) {
        this.abonoParcialApplication.deletar(id);
    }

    public List<AbonoParcial> search() {
        return this.abonoParcialApplication.search();
    }

    public AbonoParcial searchById(int id) {
        return this.abonoParcialApplication.buscarPorId(id);
    }

    public boolean isEmpty() {
        return this.abonoParcialApplication.estaVazio();
    }
}
