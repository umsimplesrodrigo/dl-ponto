package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "horarios")
public class Horario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dia_semana")
    private Long diaSemana;

    @Column(name = "nome")
    private String nome;

    @Column(name = "entrada1")
    private String entrada1;

    @Column(name = "saida1")
    private String saida1;

    @Column(name = "entrada2")
    private String entrada2;

    @Column(name = "saida2")
    private String saida2;

    @Column(name = "entrada3")
    private String entrada3;

    @Column(name = "saida3")
    private String saida3;

    @Column(name = "entrada4")
    private String entrada4;

    @Column(name = "saida4")
    private String saida4;

    @Column(name = "entrada5")
    private String entrada5;

    @Column(name = "saida5")
    private String saida5;

    @Column(name = "extra")
    private boolean extra;

    @Column(name = "compensado")
    private boolean compensado;

    @Column(name = "carga_diaria")
    private boolean cargaDiaria;

    @Column(name = "neutro")
    private boolean neutro;

    @Column(name = "carga")
    private Long carga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDia_semana() {
        return diaSemana;
    }

    public void setDia_semana(Long dia_semana) {
        this.diaSemana = dia_semana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(String entrada1) {
        this.entrada1 = entrada1;
    }

    public String getSaida1() {
        return saida1;
    }

    public void setSaida1(String saida1) {
        this.saida1 = saida1;
    }

    public String getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(String entrada2) {
        this.entrada2 = entrada2;
    }

    public String getSaida2() {
        return saida2;
    }

    public void setSaida2(String saida2) {
        this.saida2 = saida2;
    }

    public String getEntrada3() {
        return entrada3;
    }

    public void setEntrada3(String entrada3) {
        this.entrada3 = entrada3;
    }

    public String getSaida3() {
        return saida3;
    }

    public void setSaida3(String saida3) {
        this.saida3 = saida3;
    }

    public String getEntrada4() {
        return entrada4;
    }

    public void setEntrada4(String entrada4) {
        this.entrada4 = entrada4;
    }

    public String getSaida4() {
        return saida4;
    }

    public void setSaida4(String saida4) {
        this.saida4 = saida4;
    }

    public String getEntrada5() {
        return entrada5;
    }

    public void setEntrada5(String entrada5) {
        this.entrada5 = entrada5;
    }

    public String getSaida5() {
        return saida5;
    }

    public void setSaida5(String saida5) {
        this.saida5 = saida5;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public boolean isCompensado() {
        return compensado;
    }

    public void setCompensado(boolean compensado) {
        this.compensado = compensado;
    }

    public boolean isCarga_diaria() {
        return cargaDiaria;
    }

    public void setCarga_diaria(boolean carga_diaria) {
        this.cargaDiaria = carga_diaria;
    }

    public boolean isNeutro() {
        return neutro;
    }

    public void setNeutro(boolean neutro) {
        this.neutro = neutro;
    }

    public Long getCarga() {
        return carga;
    }

    public void setCarga(Long carga) {
        this.carga = carga;
    }
}
