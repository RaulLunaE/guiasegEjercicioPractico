package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.guiaseg.Model.Clasificacion;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {

    Optional<Clasificacion> findById(Long id);

    void deleteById(Long id);
}