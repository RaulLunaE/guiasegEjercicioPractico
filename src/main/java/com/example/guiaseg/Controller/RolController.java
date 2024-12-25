package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Rol;
import com.example.guiaseg.View.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping
    public Rol create(@RequestBody Rol rol) {
        return rolService.saveOrUpdate(rol);
    }

    @GetMapping("/{id}")
    public Optional<Rol> getById(@PathVariable Long id) {
        return rolService.findById(id);
    }

    @GetMapping("/rol/{rol}")
    public Optional<Rol> getByRol(@PathVariable String rol) {
        return rolService.findByRol(rol);
    }

    @GetMapping
    public List<Rol> getAll() {
        return rolService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        rolService.delete(id);
    }
}
