package com.example.guiaseg.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Competencia {

    @Id
    private Long idCompetencias; // id_competencias

    private String nombre;
    private String descripcion;

    // Getters y Setters
    public Long getIdCompetencias() {
        return idCompetencias;
    }

    public void setIdCompetencias(Long idCompetencias) {
        this.idCompetencias = idCompetencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
