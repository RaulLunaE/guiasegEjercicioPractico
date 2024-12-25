package com.example.guiaseg.View;

import com.example.guiaseg.Model.TipoPago;
import com.example.guiaseg.repository.TipoPagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    public TipoPago saveOrUpdate(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    public Optional<TipoPago> findById(Long id) {
        return tipoPagoRepository.findById(id);
    }

    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    public void delete(Long id) {
        tipoPagoRepository.deleteById(id);
    }
}
