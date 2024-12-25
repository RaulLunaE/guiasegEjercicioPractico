package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.Factura;
import com.example.guiaseg.View.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping
    public Factura create(@RequestBody Factura factura) {
        return facturaService.saveOrUpdate(factura);
    }

    @GetMapping("/{id}")
    public Optional<Factura> getById(@PathVariable Long id) {
        return facturaService.findById(id);
    }

    @GetMapping
    public List<Factura> getAll() {
        return facturaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        facturaService.delete(id);
    }
}
