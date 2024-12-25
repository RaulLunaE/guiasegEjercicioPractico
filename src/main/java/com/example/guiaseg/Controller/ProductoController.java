package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Producto;
import com.example.guiaseg.View.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.saveOrUpdate(producto);
    }

    @GetMapping("/{id}")
    public Optional<Producto> getById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @GetMapping
    public List<Producto> getAll() {
        return productoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }
}
