package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Proveedores;
import com.example.guiaseg.View.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public Proveedores create(@RequestBody Proveedores Proveedores) {
        return proveedorService.saveOrUpdate(Proveedores);
    }

    @GetMapping("/{id}")
    public Optional<Proveedores> getById(@PathVariable Long id) {
        return proveedorService.findById(id);
    }

    @GetMapping
    public List<Proveedores> getAll() {
        return proveedorService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        proveedorService.delete(id);
    }
}