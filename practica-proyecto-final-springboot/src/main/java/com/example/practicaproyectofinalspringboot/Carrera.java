package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Carrera {

    @NotNull(message = "El ID de la carrera es obligatorio")
    @Positive(message = "El ID de la carrera debe ser un número positivo")
    @Column(nullable = false)
    private Integer idCarrera;

    @NotNull(message = "El ID de la facultad es obligatorio")
    @Positive(message = "El ID de la facultad debe ser un número positivo")
    @Column(nullable = false)
    private Integer idFacultad;

    @NotNull(message = "El nombre de la carrera es obligatorio")
    @NotBlank(message = "El nombre de la carrera no puede estar vacio")
    @Size(max = 150, message = "El nombre de la carrera no debe exceder los 150 caracteres")
    @Column(nullable = false, length = 150)
    private String nombreCarrera;

    public Carrera() {}

    public Carrera(Integer idCarrera, Integer idFacultad, String nombreCarrera) {
        this.idCarrera = idCarrera;
        this.idFacultad = idFacultad;
        this.nombreCarrera = nombreCarrera;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "idCarrera=" + idCarrera +
                ", idFacultad=" + idFacultad +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                '}';
    }
}