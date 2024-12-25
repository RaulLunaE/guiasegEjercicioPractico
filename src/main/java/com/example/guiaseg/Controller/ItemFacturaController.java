package com.example.guiaseg.Controller;

import com.example.guiaseg.Model.ItemFactura;
import com.example.guiaseg.View.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/itemfactura")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaService itemFacturaService;

    @PostMapping
    public ItemFactura create(@RequestBody ItemFactura itemFactura) {
        return itemFacturaService.saveOrUpdate(itemFactura);
    }

    @GetMapping("/{id}")
    public Optional<ItemFactura> getById(@PathVariable Long id) {
        return itemFacturaService.findById(id);
    }

    @GetMapping
    public List<ItemFactura> getAll() {
        return itemFacturaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemFacturaService.delete(id);
    }
}