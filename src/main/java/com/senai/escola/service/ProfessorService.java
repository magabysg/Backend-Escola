package com.senai.escola.service;

import com.senai.escola.entity.Professor;
import com.senai.escola.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> mostrarTodos(){
        return professorRepository.findAll();
    }

    public void addProfessor(Professor p){
        Professor professor = new Professor(p.getNome(), p.getIdade(), p.getCpf());
        professorRepository.save(professor);
    }
}
