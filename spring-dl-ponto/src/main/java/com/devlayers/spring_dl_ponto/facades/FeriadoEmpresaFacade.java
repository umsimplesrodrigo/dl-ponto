package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.FeriadoEmpresaApplication;
import com.devlayers.spring_dl_ponto.applications.FuncaoApplication;
import com.devlayers.spring_dl_ponto.entities.FeriadoEmpresa;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeriadoEmpresaFacade {
    private FeriadoEmpresaApplication feriadoEmpresaApplication;

    public FeriadoEmpresaFacade(FeriadoEmpresaApplication feriadoEmpresaApplication) {
        this.feriadoEmpresaApplication = feriadoEmpresaApplication;
    }

    public void cadastrar(FeriadoEmpresa feriadoEmpresa) {
        this.feriadoEmpresaApplication.cadastrarFeriadoEmpresa(feriadoEmpresa);
    }

    public void atualizar(int id, FeriadoEmpresa feriadoEmpresa) {
        this.feriadoEmpresaApplication.atualizar(id, feriadoEmpresa);
    }

    public void deletar(int id) {
        this.feriadoEmpresaApplication.deletar(id);
    }

    public List<FeriadoEmpresa> search() {
        return this.feriadoEmpresaApplication.search();
    }

    public FeriadoEmpresa searchById(int id) {
        return this.feriadoEmpresaApplication.buscarPorId(id);
    }

    public boolean isEmpty() {
        return this.feriadoEmpresaApplication.estaVazio();
    }
}
