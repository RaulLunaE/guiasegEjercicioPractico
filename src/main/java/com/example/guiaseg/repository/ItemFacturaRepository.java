package com.example.guiaseg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.guiaseg.Model.ItemFactura;

@Repository
public interface ItemFacturaRepository extends JpaRepository<ItemFactura, Long> {

    Optional<ItemFactura> findById(Long id);

    void deleteById(Long id);
}