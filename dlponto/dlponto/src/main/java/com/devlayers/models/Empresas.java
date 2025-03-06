package com.devlayers.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String inscricao;

    @Column
    private String cnpj;

    @Column
    private String endereco;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String cep;

    @Column
    private String estado;

    @Column
    private String cartao_responsavel;

    @Column
    private String cartao_cargo;

    @Column
    private String responsavel_email;

    @Column
    private Boolean usa_cpf;

    @Column
    private String n_folha;

    @Column
    private String telefone;

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
        return cartao_responsavel;
    }

    public void setCartao_responsavel(String cartao_responsavel) {
        this.cartao_responsavel = cartao_responsavel;
    }

    public String getCartao_cargo() {
        return cartao_cargo;
    }

    public void setCartao_cargo(String cartao_cargo) {
        this.cartao_cargo = cartao_cargo;
    }

    public String getResponsavel_email() {
        return responsavel_email;
    }

    public void setResponsavel_email(String responsavel_email) {
        this.responsavel_email = responsavel_email;
    }

    public Boolean getUsa_cpf() {
        return usa_cpf;
    }

    public void setUsa_cpf(Boolean usa_cpf) {
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
