package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "n_folha")
    private String nFolha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "n_identificador")
    private String nIdentificador;

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
    private LocalDate afastDataInicio;

    @Column(name = "afast_data_fim")
    private LocalDate afastDataFim;

    @Column(name = "invisivel")
    private boolean invisivel;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "pis")
    private String pis;

    public Funcionario() {
    }

    public Funcionario(String nFolha, String nome, String nIdentificador, Empresa empresa, Horario horario, Funcao funcao, Departamento departamento, LocalDate admissao, LocalDate demissao, LocalDate afastDataInicio, LocalDate afastDataFim, boolean invisivel, String cpf, String pis) {
        this.nFolha = nFolha;
        this.nome = nome;
        this.nIdentificador = nIdentificador;
        this.empresa = empresa;
        this.horario = horario;
        this.funcao = funcao;
        this.departamento = departamento;
        this.admissao = admissao;
        this.demissao = demissao;
        this.afastDataInicio = afastDataInicio;
        this.afastDataFim = afastDataFim;
        this.invisivel = invisivel;
        this.cpf = cpf;
        this.pis = pis;
    }

    public Funcionario(Long id, String nFolha, String nome, String nIdentificador, Empresa empresa, Horario horario, Funcao funcao, Departamento departamento, LocalDate admissao, LocalDate demissao, LocalDate afastDataInicio, LocalDate afastDataFim, boolean invisivel, String cpf, String pis) {
        this.id = id;
        this.nFolha = nFolha;
        this.nome = nome;
        this.nIdentificador = nIdentificador;
        this.empresa = empresa;
        this.horario = horario;
        this.funcao = funcao;
        this.departamento = departamento;
        this.admissao = admissao;
        this.demissao = demissao;
        this.afastDataInicio = afastDataInicio;
        this.afastDataFim = afastDataFim;
        this.invisivel = invisivel;
        this.cpf = cpf;
        this.pis = pis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getN_folha() {
        return nFolha;
    }

    public void setN_folha(String n_folha) {
        this.nFolha = n_folha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getN_identificador() {
        return nIdentificador;
    }

    public void setN_identificador(String n_identificador) {
        this.nIdentificador = n_identificador;
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
        return afastDataInicio;
    }

    public void setAfast_data_inicio(LocalDate afast_data_inicio) {
        this.afastDataInicio = afast_data_inicio;
    }

    public LocalDate getAfast_data_fim() {
        return afastDataFim;
    }

    public void setAfast_data_fim(LocalDate afast_data_fim) {
        this.afastDataFim = afast_data_fim;
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

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nFolha='" + nFolha + '\'' +
                ", nome='" + nome + '\'' +
                ", nIdentificador='" + nIdentificador + '\'' +
                ", empresa=" + empresa +
                ", horario=" + horario +
                ", funcao=" + funcao +
                ", departamento=" + departamento +
                ", admissao=" + admissao +
                ", demissao=" + demissao +
                ", afastDataInicio=" + afastDataInicio +
                ", afastDataFim=" + afastDataFim +
                ", invisivel=" + invisivel +
                ", cpf='" + cpf + '\'' +
                ", pis='" + pis + '\'' +
                '}';
    }
}
