package com.devlayers.applications;

import com.devlayers.models.Empresas;
import com.devlayers.repositories.EmpresasReporitory;

import java.util.List;

public class EmpresasApplication {
    private EmpresasReporitory empresasReporitory;

    public EmpresasApplication(EmpresasReporitory empresasReporitory) {
        this.empresasReporitory = empresasReporitory;
    }

    public void register(Empresas empresa) {
        empresasReporitory.addEmpresas(empresa);
    }

    public void update(int id, Empresas empresa) {
        empresasReporitory.updateEmpresa(id, empresa);
    }

    public void remove(int id) {
        Empresas empresa = empresasReporitory.searchById(id);
        empresasReporitory.removeEmpresa(id);
    }

    public List<Empresas> search() {
        return this.empresasReporitory.searchEmpresas();
    }

    public Empresas searchById(int id) {
        return this.empresasReporitory.searchById(id);
    }

    public boolean isEmpty() {
        return this.empresasReporitory.isEmpty();
    }
}
