package com.example.guiaseg.View;

import com.example.guiaseg.Model.Competencia;
import com.example.guiaseg.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetenciaService {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    public Competencia saveOrUpdate(Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    public Optional<Competencia> findById(Long id) {
        return competenciaRepository.findById(id);
    }

    public Optional<Competencia> findByNombre(String nombre) {
        return competenciaRepository.findByNombre(nombre);
    }

    public List<Competencia> findAll() {
        return competenciaRepository.findAll();
    }

    public void delete(Long id) {
        competenciaRepository.deleteById(id);
    }
}
