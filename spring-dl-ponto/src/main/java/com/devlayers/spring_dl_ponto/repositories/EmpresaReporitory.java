package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Empresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresaReporitory {
    private List<Empresa> empresas = new ArrayList<>();

    public Empresa searchById(int id) {
        Empresa empresa = empresas.stream().filter(p -> p.getId() == id).findFirst().get();

        return empresa;
    }

    public List<Empresa> searchEmpresas() {
        return empresas;
    }

    public void addEmpresas(Empresa empresa) {
        empresas.add(empresa);
    }

    public void removeEmpresa(int id) {
        empresas.removeIf(p -> p.getId() == id);
    }

    public void updateEmpresa(int id, Empresa empresa) {
        Empresa empresaInMemory = this.searchById(id);

        empresaInMemory.setNome(empresa.getNome());
        empresaInMemory.setInscricao(empresa.getInscricao());
        empresaInMemory.setCnpj(empresa.getCnpj());
        empresaInMemory.setEndereco(empresa.getEndereco());
        empresaInMemory.setBairro(empresa.getBairro());
        empresaInMemory.setCidade(empresa.getCidade());
        empresaInMemory.setCep(empresa.getCep());
        empresaInMemory.setEstado(empresa.getEstado());
        empresaInMemory.setCartao_responsavel(empresa.getCartao_responsavel());
        empresaInMemory.setCartao_cargo(empresa.getCartao_cargo());
        empresaInMemory.setResponsavel_email(empresa.getResponsavel_email());
        empresaInMemory.setUsa_cpf(empresa.isUsa_cpf());
        empresaInMemory.setN_folha(empresa.getN_folha());
        empresaInMemory.setTelefone(empresa.getTelefone());
        empresaInMemory.setFeriados(empresa.getFeriados());
    }

    public boolean isEmpty() {
        return empresas.isEmpty();
    }
}
