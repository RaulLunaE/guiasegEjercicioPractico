package com.example.guiaseg.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class TipoPago {

    @Id
    private Long idTipoPago; // Asegúrate de que el tipo de dato coincida con el tipo en la base de datos

    private String tipo;
    private String descrip;

    // Getters y Setters
    public Long getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Long idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
