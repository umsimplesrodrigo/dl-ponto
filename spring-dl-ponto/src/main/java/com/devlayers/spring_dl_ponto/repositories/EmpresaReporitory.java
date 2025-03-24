package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import com.devlayers.spring_dl_ponto.repositories.jpa.EmpresaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaReporitory {
    private final EmpresaJpa empresaJpa;

    @Autowired
    public EmpresaReporitory(EmpresaJpa empresaJpa) {
        this.empresaJpa = empresaJpa;
    }

    public Empresa searchById(int id) {
        return empresaJpa.findById(id).get();
    }

    public List<Empresa> searchEmpresas() {
        return empresaJpa.findAll();
    }

    public void addEmpresas(Empresa empresa) {
        this.empresaJpa.save(empresa);
    }

    public void removeEmpresa(int id) {
        this.empresaJpa.deleteById(id);
    }

    public void updateEmpresa(int id, Empresa empresa) {
        Empresa empresaInDb = this.empresaJpa.findById(id).get();

        empresaInDb.setNome(empresa.getNome());
        empresaInDb.setInscricao(empresa.getInscricao());
        empresaInDb.setCnpj(empresa.getCnpj());
        empresaInDb.setEndereco(empresa.getEndereco());
        empresaInDb.setBairro(empresa.getBairro());
        empresaInDb.setCidade(empresa.getCidade());
        empresaInDb.setCep(empresa.getCep());
        empresaInDb.setEstado(empresa.getEstado());
        empresaInDb.setCartao_responsavel(empresa.getCartao_responsavel());
        empresaInDb.setCartao_cargo(empresa.getCartao_cargo());
        empresaInDb.setResponsavel_email(empresa.getResponsavel_email());
        empresaInDb.setUsa_cpf(empresa.isUsa_cpf());
        empresaInDb.setN_folha(empresa.getN_folha());
        empresaInDb.setTelefone(empresa.getTelefone());
        empresaInDb.setFeriados(empresa.getFeriados());

        this.empresaJpa.save(empresaInDb);
    }

    public boolean isEmpty() {
        return false;
    }
}
