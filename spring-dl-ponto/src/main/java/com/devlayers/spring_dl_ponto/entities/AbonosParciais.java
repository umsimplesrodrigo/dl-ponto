package com.devlayers.spring_dl_ponto.entities;

import java.time.LocalDate;

public class AbonosParciais {
    private Long id;
    private Funcionarios funcionario;
    private LocalDate data;
    private String hora_inicio;
    private String hora_fim;
    private Justificativas justificativa;
    private boolean tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(String hora_fim) {
        this.hora_fim = hora_fim;
    }

    public Justificativas getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativas justificativa) {
        this.justificativa = justificativa;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
