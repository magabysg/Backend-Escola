package com.senai.escola.controller;

import com.senai.escola.entity.Sala;
import com.senai.escola.service.SalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sala")
public class SalaController {

    private final SalaService salaService;
    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    //metodo para mostrar sala
    @GetMapping
    public List<Sala> mostrarSala(){
        return salaService.mostrarTodos();
    }

    //metodo para criar sala
    @PostMapping
    public void criarSala(@RequestBody Sala s){
        salaService.criarSala(s);
    }
}
