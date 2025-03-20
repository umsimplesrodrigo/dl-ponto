package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "n_folha")
    private String n_folha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "n_identificador")
    private String n_identificador;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_horario")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "id_funcao")
    private Funcao funcao;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    @Column(name = "admissao")
    private LocalDate admissao;

    @Column(name = "demissao")
    private LocalDate demissao;

    @Column(name = "afast_data_inicio")
    private LocalDate afast_data_inicio;

    @Column(name = "afast_data_fim")
    private LocalDate afast_data_fim;

    @Column(name = "invisivel")
    private boolean invisivel;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "pis")
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
