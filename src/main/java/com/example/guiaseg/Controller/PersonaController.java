package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Persona;
import com.example.guiaseg.View.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return personaService.saveOrUpdate(persona);
    }

    @GetMapping("/{id}")
    public Optional<Persona> getById(@PathVariable Long id) {
        return personaService.findById(id);
    }

    @GetMapping
    public List<Persona> getAll() {
        return personaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personaService.delete(id);
    }
}
