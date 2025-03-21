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
    public void cadastrarHorario(@RequestBody Horario horario) {
        this.horarioFacade.cadastrarHorario(horario);
    }

    @GetMapping("/{id}")
    public Horario buscarHorarioPorID(@PathVariable Long id) {
        return this.horarioFacade.buscarHorarioPorID(id);
    }

    @GetMapping("")
    public List<Horario> buscarHorarios() {
        return this.horarioFacade.buscarHorarios();
    }

    @PutMapping("/{id}")
    public void atualizarHorario(@PathVariable Long id, @RequestBody Horario horario) {
        this.horarioFacade.atualizarHorario(id, horario);
    }

    @DeleteMapping("{id}")
    public void apagarHorario(@PathVariable Long id) {
        this.horarioFacade.apagarHorario(id);
    }
}
