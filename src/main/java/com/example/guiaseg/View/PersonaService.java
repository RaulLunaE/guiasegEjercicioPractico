package com.example.guiaseg.View;

import com.example.guiaseg.Model.Persona;
import com.example.guiaseg.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona saveOrUpdate(Persona persona) {
        return personaRepository.save(persona);
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public void delete(Long id) {
        personaRepository.deleteById(id);
    }
}
