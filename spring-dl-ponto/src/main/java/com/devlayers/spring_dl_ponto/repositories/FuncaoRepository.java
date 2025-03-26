package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Funcao;
import com.devlayers.spring_dl_ponto.repositories.jpa.FuncaoJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FuncaoRepository {
    private final FuncaoJPA funcaoJPA;

    public FuncaoRepository(FuncaoJPA funcaoJPA) {
        this.funcaoJPA = funcaoJPA;
    }

    public Funcao findById(Long id) {
        return this.funcaoJPA.findById(id).orElse(null);
    }

    public List<Funcao> findAll() {
        return this.funcaoJPA.findAll();
    }

    public void save(Funcao funcao) {
        this.funcaoJPA.save(funcao);
    }

    public void deleteById(Long id) {
        this.funcaoJPA.deleteById(id);
    }

    public void updateFuncao(Long id, Funcao funcao) {
        Funcao funcaoInDb = this.funcaoJPA.findById(id).orElse(null);

        if (funcaoInDb != null) {
            funcaoInDb.setDescricao(funcao.getDescricao());

            this.funcaoJPA.save(funcaoInDb);
        }
    }
}
