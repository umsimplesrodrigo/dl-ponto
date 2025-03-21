package com.devlayers.spring_dl_ponto.repositories;

import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import com.devlayers.spring_dl_ponto.entities.Funcao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AbonoParcialRepository {
    private List<AbonoParcial> abonosParciais = new ArrayList<>();

    public AbonoParcial buscarPorId(int id) {
        AbonoParcial abonoParcial = abonosParciais.stream().filter(p -> p.getId() == id).findFirst().get();

        return abonoParcial;
    }

    public List<AbonoParcial> buscarAbonosParciais() {
        return abonosParciais;
    }

     public void addAbonoParcial(AbonoParcial abonoParcial) {
        abonosParciais.add(abonoParcial);
     }

     public void deletarAbonoParcial(int id) {
        abonosParciais.removeIf(p -> p.getId() == id);
     }

     public void upadateAbonoParcial(int id, AbonoParcial abonoParcial) {
         AbonoParcial abonoParcialInMemory = this.buscarPorId(id);

         abonoParcialInMemory.setFuncionario(abonoParcial.getFuncionario());
         abonoParcialInMemory.setData(abonoParcial.getData());
         abonoParcialInMemory.setHora_inicio(abonoParcial.getHora_inicio());
         abonoParcialInMemory.setHora_fim(abonoParcial.getHora_fim());
         abonoParcialInMemory.setJustificativa(abonoParcial.getJustificativa());
         abonoParcialInMemory.setTipo(abonoParcial.isTipo());
     }

     public boolean estaVazio() {
        return abonosParciais.isEmpty();
     }
}
