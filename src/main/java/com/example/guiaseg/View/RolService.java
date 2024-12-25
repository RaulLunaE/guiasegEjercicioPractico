package com.example.guiaseg.View;

import com.example.guiaseg.Model.Rol;
import com.example.guiaseg.repository.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol saveOrUpdate(Rol rol) {
        return rolRepository.save(rol);
    }

    public Optional<Rol> findById(Long id) {
        return rolRepository.findById(id);
    }

    public Optional<Rol> findByRol(String rol) {
        return rolRepository.findByRol(rol);
    }

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    public void delete(Long id) {
        rolRepository.deleteById(id);
    }
}
