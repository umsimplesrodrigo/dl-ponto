package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.EmpresaApplication;
import com.devlayers.spring_dl_ponto.entities.Empresas;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresaFacade {
    private EmpresaApplication empresaApplication;

    public EmpresaFacade(EmpresaApplication empresaApplication) {
        this.empresaApplication = empresaApplication;
    }

    public void register(Empresas empresa) {
        this.empresaApplication.register(empresa);
    }

    public void update(int id, Empresas empresa) {
        this.empresaApplication.update(id, empresa);
    }

    public void remove(int id) {
        this.empresaApplication.remove(id);
    }

    public List<Empresas> search() {
        return this.empresaApplication.search();
    }

    public Empresas searchById(int id) {
        return this.empresaApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.empresaApplication.isEmpty();
    }
}
