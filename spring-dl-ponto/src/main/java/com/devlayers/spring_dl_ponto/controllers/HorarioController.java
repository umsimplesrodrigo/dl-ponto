package com.devlayers.spring_dl_ponto.controllers;

import com.devlayers.spring_dl_ponto.entities.Horario;
import com.devlayers.spring_dl_ponto.facades.HorarioFacade;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class HorarioController {
    private HorarioFacade horarioFacade;

    public HorarioController(HorarioFacade horarioFacade) {
        this.horarioFacade = horarioFacade;
    }

    @PostMapping("")
    public void save(@RequestBody Horario horario) {
        this.horarioFacade.save(horario);
    }

    @GetMapping("/{id}")
    public Horario findById(@PathVariable Long id) {
        return this.horarioFacade.findById(id);
    }

    @GetMapping("")
    public List<Horario> findAll() {
        return this.horarioFacade.findAll();
    }

    @PutMapping("/{id}")
    public void updateHorario(@PathVariable Long id, @RequestBody Horario horario) {
        this.horarioFacade.updateHorario(id, horario);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        this.horarioFacade.deleteById(id);
    }
}
