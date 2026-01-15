package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CatalogoEstado {

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idCatalogoEstado;

    @NotNull(message = "No puede estar vacio")
    @Size(max = 50, message = "Se excedio la cantidad de caracteres")
    @Column(nullable = false)
    private String nombreEstado;

    @NotNull(message = "No puede estar vacio")
    @Size(max = 50, message = "Se excedio la cantidad de caracteres")
    @Column(nullable = false)
    private String modulo;

    public CatalogoEstado() {}

    public CatalogoEstado(Integer idCatalogoEstado, String nombreEstado, String modulo) {
        this.idCatalogoEstado = idCatalogoEstado;
        this.nombreEstado = nombreEstado;
        this.modulo = modulo;
    }

    public Integer getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(Integer idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "CatalogoEstado{" +
                "idCatalogoEstado=" + idCatalogoEstado +
                ", nombreEstado='" + nombreEstado + '\'' +
                ", modulo='" + modulo + '\'' +
                '}';
    }
}
