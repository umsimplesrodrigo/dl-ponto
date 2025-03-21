package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.entities.FeriadoEmpresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FeriadoEmpresaRepository {
    private List<FeriadoEmpresa> feriadosEmpresas = new ArrayList<>();

    public FeriadoEmpresa buscarPorId(int id) {
        FeriadoEmpresa feriadoEmpresa = feriadosEmpresas.stream().filter(p -> p.getId() == id).findFirst().get();

        return feriadoEmpresa;
    }

    public List<FeriadoEmpresa> buscarFeriadosEmpresas() {
        return feriadosEmpresas;
    }

    public void addFeriadoEmpresa(FeriadoEmpresa feriadoEmpresa) {
        feriadosEmpresas.add(feriadoEmpresa);
    }

    public void deletarFeriadoEmrpesa(int id) {
        feriadosEmpresas.removeIf(p -> p.getId() == id);
    }

    public void updateFeriadoEmpresa(int id, FeriadoEmpresa feriadoEmpresa) {
        FeriadoEmpresa feriadoEmpresaInMemory = this.buscarPorId(id);

        feriadoEmpresaInMemory.setEmpresa(feriadoEmpresa.getEmpresa());
        feriadoEmpresaInMemory.setFeriado(feriadoEmpresa.getFeriado());
    }

    public boolean estaVazio() {
        return feriadosEmpresas.isEmpty();
    }
}
