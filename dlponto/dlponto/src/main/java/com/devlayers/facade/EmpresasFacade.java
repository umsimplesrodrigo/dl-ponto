package com.devlayers.facade;

import com.devlayers.applications.EmpresasApplication;
import com.devlayers.models.Empresas;

import java.util.List;

public class EmpresasFacade {
    private EmpresasApplication empresasApplication;

    public EmpresasFacade(EmpresasApplication empresasApplication) {
        this.empresasApplication = empresasApplication;
    }

    public void register(Empresas empresa) {
        this.empresasApplication.register(empresa);
    }

    public void update(int id, Empresas empresa) {
        this.empresasApplication.update(id, empresa);
    }

    public void remove(int id) {
        this.empresasApplication.remove(id);
    }

    public List<Empresas> search() {
        return this.empresasApplication.search();
    }

    public Empresas searchById(int id) {
        return this.empresasApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.empresasApplication.isEmpty();
    }
}
