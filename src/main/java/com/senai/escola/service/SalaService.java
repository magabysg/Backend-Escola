package com.senai.escola.service;

import com.senai.escola.entity.Sala;
import com.senai.escola.repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository salaRepository;
    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public List<Sala> mostrarTodos(){
        return salaRepository.findAll();
    }

    public void criarSala(Sala s){
        Sala sala = new Sala(s.getNome(),s.getMesas(),s.getAluno(),s.getCadeiras());
        salaRepository.save(sala);
    }


}
