package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class Postulacion {

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idPostulacion;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idConvocatoria;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idUsuarioPostulante;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idEstadoPostulacion;

    @NotNull(message = "No puede estar en blanco")
    @Column(nullable = false)
    private LocalDate fechaPostulacion;

    public Postulacion() {
    }

    public Postulacion(Integer idPostulacion, Integer idConvocatoria, Integer idUsuarioPostulante, Integer idEstadoPostulacion, LocalDate fechaPostulacion) {
        this.idPostulacion = idPostulacion;
        this.idConvocatoria = idConvocatoria;
        this.idUsuarioPostulante = idUsuarioPostulante;
        this.idEstadoPostulacion = idEstadoPostulacion;
        this.fechaPostulacion = fechaPostulacion;
    }

    public Integer getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(Integer idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public Integer getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(Integer idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public Integer getIdUsuarioPostulante() {
        return idUsuarioPostulante;
    }

    public void setIdUsuarioPostulante(Integer idUsuarioPostulante) {
        this.idUsuarioPostulante = idUsuarioPostulante;
    }

    public Integer getIdEstadoPostulacion() {
        return idEstadoPostulacion;
    }

    public void setIdEstadoPostulacion(Integer idEstadoPostulacion) {
        this.idEstadoPostulacion = idEstadoPostulacion;
    }

    public LocalDate getFechaPostulacion() {
        return fechaPostulacion;
    }

    public void setFechaPostulacion(LocalDate fechaPostulacion) {
        this.fechaPostulacion = fechaPostulacion;
    }

    @Override
    public String toString() {
        return "Postulacion{" +
                "idPostulacion=" + idPostulacion +
                ", idConvocatoria=" + idConvocatoria +
                ", idUsuarioPostulante=" + idUsuarioPostulante +
                ", idEstadoPostulacion=" + idEstadoPostulacion +
                ", fechaPostulacion=" + fechaPostulacion +
                '}';
    }
}
