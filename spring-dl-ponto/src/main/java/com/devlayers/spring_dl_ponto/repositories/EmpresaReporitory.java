package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Empresas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresaReporitory {
    private List<Empresas> empresas = new ArrayList<>();

    public Empresas searchById(int id) {
        Empresas empresa = empresas.stream().filter(p -> p.getId() == id).findFirst().get();

        return empresa;
    }

    public List<Empresas> searchEmpresas() {
        return empresas;
    }

    public void addEmpresas(Empresas empresa) {
        empresas.add(empresa);
    }

    public void removeEmpresa(int id) {
        empresas.removeIf(p -> p.getId() == id);
    }

    public void updateEmpresa(int id, Empresas empresa) {
        Empresas empresaInMemory = this.searchById(id);

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
    }

    public boolean isEmpty() {
        return empresas.isEmpty();
    }
}
