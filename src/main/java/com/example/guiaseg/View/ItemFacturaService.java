package com.example.guiaseg.View;

import com.example.guiaseg.Model.ItemFactura;
import com.example.guiaseg.repository.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemFacturaService {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    public ItemFactura saveOrUpdate(ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    public Optional<ItemFactura> findById(Long id) {
        return itemFacturaRepository.findById(id);
    }

    public List<ItemFactura> findAll() {
        return itemFacturaRepository.findAll();
    }

    public void delete(Long id) {
        itemFacturaRepository.deleteById(id);
    }
}
