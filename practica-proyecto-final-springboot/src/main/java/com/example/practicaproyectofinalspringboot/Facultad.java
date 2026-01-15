package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Facultad {
    private Integer idFacultad;

    @NotNull(message = "El ID del usuario decano es obligatorio")
    @Positive(message = "El ID del usuario decano debe ser un número positivo")
    @Column(nullable = false)
    private Integer idUsuarioDecano;

    @NotNull(message = "El nombre de la facultad es obligatorio")
    @NotBlank(message = "El nombre de la facultad no puede estar vacia")
    @Size(max = 100, message = "El nombre de la facultad no debe exceder los 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nombreFacultad;

    public Facultad() {}

    public Facultad(Integer idFacultad, Integer idUsuarioDecano, String nombreFacultad) {
        this.idFacultad = idFacultad;
        this.idUsuarioDecano = idUsuarioDecano;
        this.nombreFacultad = nombreFacultad;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public Integer getIdUsuarioDecano() {
        return idUsuarioDecano;
    }

    public void setIdUsuarioDecano(Integer idUsuarioDecano) {
        this.idUsuarioDecano = idUsuarioDecano;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                ", idUsuarioDecano=" + idUsuarioDecano +
                ", nombreFacultad='" + nombreFacultad + '\'' +
                '}';
    }
}
