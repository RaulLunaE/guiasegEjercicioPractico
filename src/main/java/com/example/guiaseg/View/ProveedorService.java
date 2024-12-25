package com.example.guiaseg.View;

import com.example.guiaseg.Model.Proveedores;
import com.example.guiaseg.repository.ProveedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public Proveedores saveOrUpdate(Proveedores proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedores> findById(Long id) {
        return proveedorRepository.findById(id);
    }

    public List<Proveedores> findAll() {
        return proveedorRepository.findAll();
    }

    public void delete(Long id) {
        proveedorRepository.deleteById(id);
    }
}