package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.guiaseg.Model.Proveedores;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedores, Long> {

    Optional<Proveedores> findById(Long id);

    void deleteById(Long id);
}