package com.example.guiaseg.View;

import com.example.guiaseg.Model.Clasificacion;
import com.example.guiaseg.repository.ClasificacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public Clasificacion saveOrUpdate(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    public Optional<Clasificacion> findById(Long id) {
        return clasificacionRepository.findById(id);
    }

    public List<Clasificacion> findAll() {
        return clasificacionRepository.findAll();
    }

    public void delete(Long id) {
        clasificacionRepository.deleteById(id);
    }
}
