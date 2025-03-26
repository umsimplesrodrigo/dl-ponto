package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.repositories.jpa.AbonoParcialJPA;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AbonoParcialRepository {
    private final AbonoParcialJPA abonoParcialJPA;

    public AbonoParcialRepository(AbonoParcialJPA abonoParcialJPA) {
        this.abonoParcialJPA = abonoParcialJPA;
    }

    public AbonoParcial findById(Long id) {
        return this.abonoParcialJPA.findById(id).orElse(null);
    }

    public List<AbonoParcial> findAll() {
        return this.abonoParcialJPA.findAll();
    }

     public void save(AbonoParcial abonoParcial) {
        this.abonoParcialJPA.save(abonoParcial);
     }

     public void deleteById(Long id) {
        this.abonoParcialJPA.deleteById(id);
     }

     public void upadateAbonoParcial(Long id, AbonoParcial abonoParcial) {
         AbonoParcial abonoParcialInDb = this.abonoParcialJPA.findById(id).orElse(null);

         if (abonoParcialInDb != null) {
             abonoParcialInDb.setFuncionario(abonoParcial.getFuncionario());
             abonoParcialInDb.setData(abonoParcial.getData());
             abonoParcialInDb.setHora_inicio(abonoParcial.getHora_inicio());
             abonoParcialInDb.setHora_fim(abonoParcial.getHora_fim());
             abonoParcialInDb.setJustificativa(abonoParcial.getJustificativa());
             abonoParcialInDb.setTipo(abonoParcial.isTipo());

             this.abonoParcialJPA.save(abonoParcialInDb);
         }
     }
}
