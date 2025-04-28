package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import com.devlayers.spring_dl_ponto.repositories.EmpresaReporitory;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmpresaApplication {
    private EmpresaReporitory empresasReporitory;

    public EmpresaApplication(EmpresaReporitory empresasReporitory) {
        this.empresasReporitory = empresasReporitory;
    }

    public void register(Empresa empresa) {
        empresasReporitory.addEmpresas(empresa);
    }

    public void update(int id, Empresa empresa) {
        empresasReporitory.updateEmpresa(id, empresa);
    }

    public void remove(int id) {
        Empresa empresa = empresasReporitory.searchById(id);
        empresasReporitory.removeEmpresa(id);
    }

    public List<Empresa> search() {
        return this.empresasReporitory.searchEmpresas();
    }

    public Empresa searchById(int id) {
        return this.empresasReporitory.searchById(id);
    }

    public boolean isEmpty() {
        return this.empresasReporitory.isEmpty();
    }
}
