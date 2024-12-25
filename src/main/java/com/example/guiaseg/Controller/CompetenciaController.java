package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Competencia;
import com.example.guiaseg.View.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/competencias")
public class CompetenciaController {

    @Autowired
    private CompetenciaService competenciaService;

    @PostMapping
    public Competencia create(@RequestBody Competencia competencia) {
        return competenciaService.saveOrUpdate(competencia);
    }

    @GetMapping("/{id}")
    public Optional<Competencia> getById(@PathVariable Long id) {
        return competenciaService.findById(id);
    }

    @GetMapping("/nombre/{nombre}")
    public Optional<Competencia> getByNombre(@PathVariable String nombre) {
        return competenciaService.findByNombre(nombre);
    }

    @GetMapping
    public List<Competencia> getAll() {
        return competenciaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        competenciaService.delete(id);
    }
}