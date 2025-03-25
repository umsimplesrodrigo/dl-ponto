package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "inscricao")
    private String inscricao;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "cep")
    private String cep;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cartao_responsavel")
    private String cartaoResponsavel;

    @Column(name = "cartao_cargo")
    private String cartaoCargo;

    @Column(name = "responsavel_email")
    private String responsavelEmail;

    @Column(name = "usa_cpf")
    private boolean usaCpf;

    @Column(name = "n_folha")
    private String nFolha;

    @Column(name = "telefone")
    private String telefone;

    @ManyToMany(mappedBy = "empresas")
    private List<Feriado> feriados = new ArrayList<>();

    @OneToMany(mappedBy = "funcionarios", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

    public Empresa() {
    }

    public Empresa(Long id, String nome, String inscricao, String cnpj, String endereco, String bairro, String cidade, String cep, String estado, String cartaoResponsavel, String cartaoCargo, String responsavelEmail, boolean usaCpf, String nFolha, String telefone, List<Feriado> feriados) {
        this.id = id;
        this.nome = nome;
        this.inscricao = inscricao;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.cartaoResponsavel = cartaoResponsavel;
        this.cartaoCargo = cartaoCargo;
        this.responsavelEmail = responsavelEmail;
        this.usaCpf = usaCpf;
        this.nFolha = nFolha;
        this.telefone = telefone;
        this.feriados = feriados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCartao_responsavel() {
        return cartaoResponsavel;
    }

    public void setCartao_responsavel(String cartao_responsavel) {
        this.cartaoResponsavel = cartao_responsavel;
    }

    public String getCartao_cargo() {
        return cartaoCargo;
    }

    public void setCartao_cargo(String cartao_cargo) {
        this.cartaoCargo = cartao_cargo;
    }

    public String getResponsavel_email() {
        return responsavelEmail;
    }

    public void setResponsavel_email(String responsavel_email) {
        this.responsavelEmail = responsavel_email;
    }

    public boolean isUsa_cpf() {
        return usaCpf;
    }

    public void setUsa_cpf(boolean usa_cpf) {
        this.usaCpf = usa_cpf;
    }

    public String getN_folha() {
        return nFolha;
    }

    public void setN_folha(String n_folha) {
        this.nFolha = n_folha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Feriado> getFeriados() {
        return feriados;
    }

    public void setFeriados(List<Feriado> feriados) {
        this.feriados = feriados;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", inscricao='" + inscricao + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cartaoResponsavel='" + cartaoResponsavel + '\'' +
                ", cartaoCargo='" + cartaoCargo + '\'' +
                ", responsavelEmail='" + responsavelEmail + '\'' +
                ", usaCpf=" + usaCpf +
                ", nFolha='" + nFolha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", feriados=" + feriados +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
