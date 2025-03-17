package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.entities.FeriadoEmpresa;
import com.devlayers.spring_dl_ponto.repositories.AbonoParcialRepository;
import com.devlayers.spring_dl_ponto.repositories.FeriadoEmpresaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeriadoEmpresaApplication {
    private FeriadoEmpresaRepository feriadosEmpresasRepository;

    public FeriadoEmpresaApplication(FeriadoEmpresaRepository feriadosEmpresasRepository) {
        this.feriadosEmpresasRepository = feriadosEmpresasRepository;
    }

    public void cadastrarFeriadoEmpresa(FeriadoEmpresa feriadoEmpresa) {
        feriadosEmpresasRepository.addFeriadoEmpresa(feriadoEmpresa);
    }

    public void atualizar(int id, FeriadoEmpresa feriadoEmpresa) {
        feriadosEmpresasRepository.updateFeriadoEmpresa(id, feriadoEmpresa);
    }

    public void deletar(int id) {
        FeriadoEmpresa feriadoEmpresa = feriadosEmpresasRepository.buscarPorId(id);
        feriadosEmpresasRepository.deletarFeriadoEmrpesa(id);
    }

    public List<FeriadoEmpresa> search() {
        return this.feriadosEmpresasRepository.buscarFeriadosEmpresas();
    }

    public FeriadoEmpresa buscarPorId(int id) {
        return this.feriadosEmpresasRepository.buscarPorId(id);
    }

    public boolean estaVazio() {
        return this.feriadosEmpresasRepository.estaVazio();
    }

}
