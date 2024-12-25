package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.guiaseg.Model.TipoPago;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago, Long> {

    Optional<TipoPago> findById(Long id);

    void deleteById(Long id);
}