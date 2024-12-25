package com.example.guiaseg.View;

import com.example.guiaseg.Model.Factura;
import com.example.guiaseg.repository.FacturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura saveOrUpdate(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Optional<Factura> findById(Long id) {
        return facturaRepository.findById(id);
    }

    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    public void delete(Long id) {
        facturaRepository.deleteById(id);
    }
}
