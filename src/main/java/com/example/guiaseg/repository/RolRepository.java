package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.guiaseg.Model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findById(Long id);

    Optional<Rol> findByRol(String rol);

    void deleteById(Long id);
}