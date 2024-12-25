package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.guiaseg.Model.Competencia;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {

    Optional<Competencia> findById(Long id);

    Optional<Competencia> findByNombre(String nombre);

    void deleteById(Long id);
}