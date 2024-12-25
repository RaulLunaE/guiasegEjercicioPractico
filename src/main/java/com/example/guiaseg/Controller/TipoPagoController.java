package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.TipoPago;
import com.example.guiaseg.View.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipopago")
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;

    @PostMapping
    public TipoPago create(@RequestBody TipoPago tipoPago) {
        return tipoPagoService.saveOrUpdate(tipoPago);
    }

    @GetMapping("/{id}")
    public Optional<TipoPago> getById(@PathVariable Long id) {
        return tipoPagoService.findById(id);
    }

    @GetMapping
    public List<TipoPago> getAll() {
        return tipoPagoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tipoPagoService.delete(id);
    }
}