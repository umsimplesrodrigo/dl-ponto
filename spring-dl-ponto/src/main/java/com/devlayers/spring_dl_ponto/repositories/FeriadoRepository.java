package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.Feriado;
import com.devlayers.spring_dl_ponto.repositories.jpa.FeriadoJPA;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FeriadoRepository {
    private final FeriadoJPA feriadoJPA;

    public FeriadoRepository(FeriadoJPA feriadoJPA) {
        this.feriadoJPA = feriadoJPA;
    }

    public void save(Feriado feriado){
        this.feriadoJPA.save(feriado);
    }

    public Feriado findById(Long id) {
        return this.feriadoJPA.findById(id).orElse(null);
    }

    public List<Feriado> findAll() {
        return this.feriadoJPA.findAll();
    }

    public void update(Long id, Feriado feriado) {
        Feriado feriadoInDb = this.feriadoJPA.findById(id).orElse(null);

        if (feriadoInDb != null) {
            feriadoInDb.setDescricao(feriado.getDescricao());
            feriadoInDb.setData(feriado.getData());

            this.feriadoJPA.save(feriadoInDb);
        }
    }

    public void deleteById(Long id) {
        this.feriadoJPA.deleteById(id);
    }
}
