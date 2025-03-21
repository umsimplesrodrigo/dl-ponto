package com.devlayers.spring_dl_ponto.entities;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name = "batidas")
public class Batida {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

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

    @Column(name = "ajuste")
    private String ajuste;

    @ManyToOne
    @JoinColumn(name = "horario_num")
    private Long horarioNum;

    @Column(name = "folga")
    private boolean folga;

    @Column(name = "bac_entrada1")
    private String bacEntrada1;

    @Column(name = "bac_saida1")
    private String bacSaida1;

    @Column(name = "bac_entrada2")
    private String bacEntrada2;

    @Column(name = "bac_saida2")
    private String bacSaida2;

    @Column(name = "bac_entrada3")
    private String bacEntrada3;

    @Column(name = "bac_saida3")
    private String bacSaida3;

    @Column(name = "bac_entrada4")
    private String bacEntrada4;

    @Column(name = "bac_saida4")
    private String bacSaida4;

    @Column(name = "bac_entrada5")
    private String bacEntrada5;

    @Column(name = "bac_saida5")
    private String bacSaida5;

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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
        return horarioNum;
    }

    public void setHorario_num(Long horario_num) {
        this.horarioNum = horario_num;
    }

    public boolean isFolga() {
        return folga;
    }

    public void setFolga(boolean folga) {
        this.folga = folga;
    }

    public String getBac_entrada1() {
        return bacEntrada1;
    }

    public void setBac_entrada1(String bac_entrada1) {
        this.bacEntrada1 = bac_entrada1;
    }

    public String getBac_saida1() {
        return bacSaida1;
    }

    public void setBac_saida1(String bac_saida1) {
        this.bacSaida1 = bac_saida1;
    }

    public String getBac_entrada2() {
        return bacEntrada2;
    }

    public void setBac_entrada2(String bac_entrada2) {
        this.bacEntrada2 = bac_entrada2;
    }

    public String getBac_saida2() {
        return bacSaida2;
    }

    public void setBac_saida2(String bac_saida2) {
        this.bacSaida2 = bac_saida2;
    }

    public String getBac_entrada3() {
        return bacEntrada3;
    }

    public void setBac_entrada3(String bac_entrada3) {
        this.bacEntrada3 = bac_entrada3;
    }

    public String getBac_saida3() {
        return bacSaida3;
    }

    public void setBac_saida3(String bac_saida3) {
        this.bacSaida3 = bac_saida3;
    }

    public String getBac_entrada4() {
        return bacEntrada4;
    }

    public void setBac_entrada4(String bac_entrada4) {
        this.bacEntrada4 = bac_entrada4;
    }

    public String getBac_saida4() {
        return bacSaida4;
    }

    public void setBac_saida4(String bac_saida4) {
        this.bacSaida4 = bac_saida4;
    }

    public String getBac_entrada5() {
        return bacEntrada5;
    }

    public void setBac_entrada5(String bac_entrada5) {
        this.bacEntrada5 = bac_entrada5;
    }

    public String getBac_saida5() {
        return bacSaida5;
    }

    public void setBac_saida5(String bac_saida5) {
        this.bacSaida5 = bac_saida5;
    }
}
