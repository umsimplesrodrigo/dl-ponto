package com.devlayers.spring_dl_ponto.entities;

import java.time.LocalDate;

public class Funcionario {
    private Long id;
    private String n_folha;
    private String nome;
    private String n_identificador;
    private Empresa empresa;
    private Horario horario;
    private Funcao funcao;
    private Departamento departamento;
    private LocalDate admissao;
    private LocalDate demissao;
    private LocalDate afast_data_inicio;
    private LocalDate afast_data_fim;
    private boolean invisivel;
    private String cpf;
    private String pis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getN_folha() {
        return n_folha;
    }

    public void setN_folha(String n_folha) {
        this.n_folha = n_folha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getN_identificador() {
        return n_identificador;
    }

    public void setN_identificador(String n_identificador) {
        this.n_identificador = n_identificador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public LocalDate getDemissao() {
        return demissao;
    }

    public void setDemissao(LocalDate demissao) {
        this.demissao = demissao;
    }

    public LocalDate getAfast_data_inicio() {
        return afast_data_inicio;
    }

    public void setAfast_data_inicio(LocalDate afast_data_inicio) {
        this.afast_data_inicio = afast_data_inicio;
    }

    public LocalDate getAfast_data_fim() {
        return afast_data_fim;
    }

    public void setAfast_data_fim(LocalDate afast_data_fim) {
        this.afast_data_fim = afast_data_fim;
    }

    public boolean isInvisivel() {
        return invisivel;
    }

    public void setInvisivel(boolean invisivel) {
        this.invisivel = invisivel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }
}
