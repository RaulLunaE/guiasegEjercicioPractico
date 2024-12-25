package com.example.guiaseg.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemFactura {

    @Id
    private Long idItemFactura; // id_item_factura

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Producto producto;

    private int cantidad;
    private double precio;
    private double subtotal;

    // Getters y Setters
    public Long getIdItemFactura() {
        return idItemFactura;
    }

    public void setIdItemFactura(Long idItemFactura) {
        this.idItemFactura = idItemFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
