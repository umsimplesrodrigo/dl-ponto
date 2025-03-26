package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Afastamento;
import com.devlayers.spring_dl_ponto.repositories.jpa.AfastamentoJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AfastamentoRepository {
    private final AfastamentoJPA afastamentoJPA;

    public AfastamentoRepository(AfastamentoJPA afastamentoJPA) {
        this.afastamentoJPA = afastamentoJPA;
    }

    public void save(Afastamento afastamento) {
        this.afastamentoJPA.save(afastamento);
    }

    public Afastamento findById(Long id) {
        return this.afastamentoJPA.findById(id).orElse(null);
    }

    public List<Afastamento> findAll() {
        return this.afastamentoJPA.findAll();
    }

    public void update(Long id, Afastamento afastamento) {
        Afastamento afastamentoInDb = this.afastamentoJPA.findById(id).orElse(null);

        if (afastamentoInDb != null) {
            afastamentoInDb.setFuncionario(afastamento.getFuncionario());
            afastamentoInDb.setDataInicio(afastamento.getDataInicio());
            afastamentoInDb.setDataFim(afastamento.getDataFim());
            afastamentoInDb.setJustificativa(afastamento.getJustificativa());
            afastamentoInDb.setObs(afastamento.getObs());

            this.afastamentoJPA.save(afastamentoInDb);
        }
    }

    public void deleteById(Long id) {
        this.afastamentoJPA.deleteById(id);
    }
}
