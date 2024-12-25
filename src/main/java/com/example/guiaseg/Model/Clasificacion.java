package com.example.guiaseg.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Clasificacion {

    @Id
    private Long idClasificacion; // id_clasificacion

    private String grupo;

    // Getters y Setters
    public Long getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Long idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
