package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.EmpresaApplication;
import com.devlayers.spring_dl_ponto.entities.Empresa;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpresaFacade {
    private EmpresaApplication empresaApplication;

    public EmpresaFacade(EmpresaApplication empresaApplication) {
        this.empresaApplication = empresaApplication;
    }

    public void register(Empresa empresa) {
        this.empresaApplication.register(empresa);
    }

    public void update(int id, Empresa empresa) {
        this.empresaApplication.update(id, empresa);
    }

    public void remove(int id) {
        this.empresaApplication.remove(id);
    }

    public List<Empresa> search() {
        return this.empresaApplication.search();
    }

    public Empresa searchById(int id) {
        return this.empresaApplication.searchById(id);
    }

    public boolean isEmpty() {
        return this.empresaApplication.isEmpty();
    }
}
