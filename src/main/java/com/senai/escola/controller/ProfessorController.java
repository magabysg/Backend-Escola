package com.senai.escola.controller;


import com.senai.escola.entity.Professor;
import com.senai.escola.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professor")
public class ProfessorController {

    private final ProfessorService professorService;
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> mostrarProfessor(){
        return professorService.mostrarTodos();
    }

    @PostMapping
    public void addProfessor(@RequestBody Professor p){
        professorService.addProfessor(p);
    }
}
