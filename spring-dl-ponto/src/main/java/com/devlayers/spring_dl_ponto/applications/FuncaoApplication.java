package com.devlayers.spring_dl_ponto.applications;

import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.repositories.FuncaoRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class FuncaoApplication {
    private FuncaoRepository funcoesRepository;

    public FuncaoApplication(FuncaoRepository funcoesRepository) {
        this.funcoesRepository = funcoesRepository;
    }

    public void save(Funcao funcao) {
        funcoesRepository.save(funcao);
    }

    public void updateFuncao(Long id, Funcao funcao) {
        funcoesRepository.updateFuncao(id, funcao);
    }

    public void deleteById(Long id) {
        Funcao funcao = funcoesRepository.findById(id);
        funcoesRepository.deleteById(id);
    }

    public List<Funcao> findAll() {
        return this.funcoesRepository.findAll();
    }

    public Funcao findById(Long id) {
        return this.funcoesRepository.findById(id);
    }
}
