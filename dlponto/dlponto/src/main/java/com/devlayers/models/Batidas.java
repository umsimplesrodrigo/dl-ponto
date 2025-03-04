package com.devlayers.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@Table(name = "batidas")
public class Batidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate data;

    @Column
    private Long id_funcionario;

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
    private String ajuste;

    @Column
    private Long horario_num;

    @Column
    private boolean folga;

    @Column
    private String bac_entrada1;

    @Column
    private String bac_saida1;

    @Column
    private String bac_entrada2;

    @Column
    private String bac_saida2;

    @Column
    private String bac_entrada3;

    @Column
    private String bac_saida3;

    @Column
    private String bac_entrada4;

    @Column
    private String bac_saida4;

    @Column
    private String bac_entrada5;

    @Column
    private String bac_saida5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
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

    public String getAjuste() {
        return ajuste;
    }

    public void setAjuste(String ajuste) {
        this.ajuste = ajuste;
    }

    public Long getHorario_num() {
        return horario_num;
    }

    public void setHorario_num(Long horario_num) {
        this.horario_num = horario_num;
    }

    public boolean isFolga() {
        return folga;
    }

    public void setFolga(boolean folga) {
        this.folga = folga;
    }

    public String getBac_entrada1() {
        return bac_entrada1;
    }

    public void setBac_entrada1(String bac_entrada1) {
        this.bac_entrada1 = bac_entrada1;
    }

    public String getBac_saida1() {
        return bac_saida1;
    }

    public void setBac_saida1(String bac_saida1) {
        this.bac_saida1 = bac_saida1;
    }

    public String getBac_entrada2() {
        return bac_entrada2;
    }

    public void setBac_entrada2(String bac_entrada2) {
        this.bac_entrada2 = bac_entrada2;
    }

    public String getBac_saida2() {
        return bac_saida2;
    }

    public void setBac_saida2(String bac_saida2) {
        this.bac_saida2 = bac_saida2;
    }

    public String getBac_entrada3() {
        return bac_entrada3;
    }

    public void setBac_entrada3(String bac_entrada3) {
        this.bac_entrada3 = bac_entrada3;
    }

    public String getBac_saida3() {
        return bac_saida3;
    }

    public void setBac_saida3(String bac_saida3) {
        this.bac_saida3 = bac_saida3;
    }

    public String getBac_entrada4() {
        return bac_entrada4;
    }

    public void setBac_entrada4(String bac_entrada4) {
        this.bac_entrada4 = bac_entrada4;
    }

    public String getBac_saida4() {
        return bac_saida4;
    }

    public void setBac_saida4(String bac_saida4) {
        this.bac_saida4 = bac_saida4;
    }

    public String getBac_entrada5() {
        return bac_entrada5;
    }

    public void setBac_entrada5(String bac_entrada5) {
        this.bac_entrada5 = bac_entrada5;
    }

    public String getBac_saida5() {
        return bac_saida5;
    }

    public void setBac_saida5(String bac_saida5) {
        this.bac_saida5 = bac_saida5;
    }
}
