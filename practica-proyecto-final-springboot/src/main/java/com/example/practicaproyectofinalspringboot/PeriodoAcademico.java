package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class PeriodoAcademico {

    @NotNull(message = "El ID del periodo académico es obligatorio")
    @Positive(message = "El ID del periodo académico debe ser un número positivo")
    @Column(nullable = false)
    private Integer idPeriodoAcademico;

    @NotNull(message = "El nombre del periodo es obligatorio")
    @NotBlank(message = "El nombre del periodo no puede estar vacio")
    @Size(max = 100, message = "El nombre del periodo no debe exceder los 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nombrePeriodo;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @Column(nullable = false)
    private LocalDate fechaInicio;

    @NotNull(message = "La fecha de fin es obligatoria")
    @Column(nullable = false)
    private LocalDate fechaFin;

    @NotNull(message = "El estado del periodo es obligatorio")
    @Column(nullable = false)
    private Boolean estado;

    public PeriodoAcademico() {}

    public PeriodoAcademico(Integer idPeriodoAcademico, String nombrePeriodo,
                            LocalDate fechaInicio, LocalDate fechaFin, Boolean estado) {
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.nombrePeriodo = nombrePeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Integer getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Integer idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public String getNombrePeriodo() {
        return nombrePeriodo;
    }

    public void setNombrePeriodo(String nombrePeriodo) {
        this.nombrePeriodo = nombrePeriodo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PeriodoAcademico{" +
                "idPeriodoAcademico=" + idPeriodoAcademico +
                ", nombrePeriodo='" + nombrePeriodo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", estado='" + estado + '\'' +
                '}';
    }
}