package com.devlayers.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String n_folha;

    @Column
    private String nome;

    @Column
    private String n_identificador;

    @Column
    private Long empresa_id;

    @Column
    private Long horario_num;

    @Column
    private Long funcao_id;

    @Column
    private Long departamento_id;

    @Column
    private LocalDate admissao;

    @Column
    private LocalDate demissao;

    @Column
    private LocalDate afast_data_ini;

    @Column
    private LocalDate afast_data_fim;

    @Column
    private boolean invisivel;

    @Column
    private String cpf;

    @Column
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

    public Long getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Long empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Long getHorario_num() {
        return horario_num;
    }

    public void setHorario_num(Long horario_num) {
        this.horario_num = horario_num;
    }

    public Long getFuncao_id() {
        return funcao_id;
    }

    public void setFuncao_id(Long funcao_id) {
        this.funcao_id = funcao_id;
    }

    public Long getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamento_id = departamento_id;
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

    public LocalDate getAfast_data_ini() {
        return afast_data_ini;
    }

    public void setAfast_data_ini(LocalDate afast_data_ini) {
        this.afast_data_ini = afast_data_ini;
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

