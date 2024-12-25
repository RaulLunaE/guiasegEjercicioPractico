package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Clasificacion;
import com.example.guiaseg.View.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clasificacion")
public class ClasificacionController {

    @Autowired
    private ClasificacionService clasificacionService;

    @PostMapping
    public Clasificacion create(@RequestBody Clasificacion clasificacion) {
        return clasificacionService.saveOrUpdate(clasificacion);
    }

    @GetMapping("/{id}")
    public Optional<Clasificacion> getById(@PathVariable Long id) {
        return clasificacionService.findById(id);
    }

    @GetMapping
    public List<Clasificacion> getAll() {
        return clasificacionService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clasificacionService.delete(id);
    }
}