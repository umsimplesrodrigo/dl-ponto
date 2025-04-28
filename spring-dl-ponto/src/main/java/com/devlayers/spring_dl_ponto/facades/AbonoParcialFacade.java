package com.devlayers.spring_dl_ponto.facades;

import com.devlayers.spring_dl_ponto.applications.AbonoParcialApplication;
import com.devlayers.spring_dl_ponto.entities.AbonoParcial;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AbonoParcialFacade {

    private AbonoParcialApplication abonoParcialApplication;

    public AbonoParcialFacade(AbonoParcialApplication abonoParcialApplication) {
        this.abonoParcialApplication = abonoParcialApplication;
    }

    public void save(AbonoParcial abonoParcial) {
        this.abonoParcialApplication.save(abonoParcial);
    }

    public void update(Long id, AbonoParcial abonoParcial) {
        this.abonoParcialApplication.update(id, abonoParcial);
    }

    public void deleteById(Long id) {
        this.abonoParcialApplication.deleteById(id);
    }

    public List<AbonoParcial> findAll() {
        return this.abonoParcialApplication.findAll();
    }

    public AbonoParcial findById(Long id) {
        return this.abonoParcialApplication.findById(id);
    }
}
