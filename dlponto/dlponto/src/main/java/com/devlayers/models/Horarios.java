package com.devlayers.models;

import jakarta.persistence.*;

@Entity
@Table(name = "horarios")
public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private Long id;

    @Column
    private Long dia_semana;

    @Column
    private String nome;

    @Column
    private String entrada1;

    @Column
    private String saida1;

    @Column
    private String entrada2;

    @Column
    private String saida2;

    @Column
    private String entrada3;

    @Column
    private String saida3;

    @Column
    private String entrada4;

    @Column
    private String saida4;

    @Column
    private String entrada5;

    @Column
    private String saida5;

    @Column
    private boolean extra;

    @Column
    private boolean compensado;

    @Column
    private boolean carga_diaria;

    @Column
    private boolean neutro;

    @Column
    private Long carga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(Long dia_semana) {
        this.dia_semana = dia_semana;
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
        return carga_diaria;
    }

    public void setCarga_diaria(boolean carga_diaria) {
        this.carga_diaria = carga_diaria;
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
