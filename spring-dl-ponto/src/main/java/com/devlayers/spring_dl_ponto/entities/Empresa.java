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

    @Column(name = "cartao_Responsavel")
    private String cartaoResponsavel;

    @Column(name = "cartao_cargo")
    private String cartaoCargo;

    @Column(name = "responsavel_email")
    private String responsavelEmail;
    private boolean usa_cpf;

    @Column(name = "nFolha")
    private String n_folha;

    @Column(name = "telefone")
    private String telefone;

    @ManyToMany(mappedBy = "empresas")
    private List<Feriado> feriados = new ArrayList<>();

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
        return usa_cpf;
    }

    public void setUsa_cpf(boolean usa_cpf) {
        this.usa_cpf = usa_cpf;
    }

    public String getN_folha() {
        return n_folha;
    }

    public void setN_folha(String n_folha) {
        this.n_folha = n_folha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
