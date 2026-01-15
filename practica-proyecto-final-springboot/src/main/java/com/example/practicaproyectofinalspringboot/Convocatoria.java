package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Convocatoria {

    @NotNull(message = "No puede estar vacío")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idConvocatoria;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idPeriodoAcademico;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idAsignatura;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idUsuarioDocente;

    @NotNull(message = "No puede estar vacio")
    @NotBlank(message = "No puede estar vacía")
    @Size(max = 50, message = "Se excedio la cantidad de caracteres")
    @Column(nullable = false,unique = true)
    private String codigo;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer cupos;

    @NotNull(message = "No puede estar en blanco")
    @Column(nullable = false)
    private LocalDate fechaInicioPostulacion;

    @NotNull(message = "No puede estar en blanco")
    @Column(nullable = false)
    private LocalDate fechaFinPostulacion;

    @NotNull(message = "No puede estar vacío")
    private Boolean activo;

    public Convocatoria() {
    }

    public Convocatoria(Integer idConvocatoria, Integer idPeriodoAcademico, Integer idAsignatura, Integer idUsuarioDocente, String codigo, Integer cupos, LocalDate fechaInicioPostulacion, LocalDate fechaFinPostulacion, Boolean activo) {
        this.idConvocatoria = idConvocatoria;
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.idAsignatura = idAsignatura;
        this.idUsuarioDocente = idUsuarioDocente;
        this.codigo = codigo;
        this.cupos = cupos;
        this.fechaInicioPostulacion = fechaInicioPostulacion;
        this.fechaFinPostulacion = fechaFinPostulacion;
        this.activo = activo;
    }

    public Integer getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(Integer idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public Integer getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Integer idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdUsuarioDocente() {
        return idUsuarioDocente;
    }

    public void setIdUsuarioDocente(Integer idUsuarioDocente) {
        this.idUsuarioDocente = idUsuarioDocente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public LocalDate getFechaInicioPostulacion() {
        return fechaInicioPostulacion;
    }

    public void setFechaInicioPostulacion(LocalDate fechaInicioPostulacion) {
        this.fechaInicioPostulacion = fechaInicioPostulacion;
    }

    public LocalDate getFechaFinPostulacion() {
        return fechaFinPostulacion;
    }

    public void setFechaFinPostulacion(LocalDate fechaFinPostulacion) {
        this.fechaFinPostulacion = fechaFinPostulacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Convocatoria{" +
                "idConvocatoria=" + idConvocatoria +
                ", idPeriodoAcademico=" + idPeriodoAcademico +
                ", idAsignatura=" + idAsignatura +
                ", idUsuarioDocente=" + idUsuarioDocente +
                ", codigo='" + codigo + '\'' +
                ", cupos='" + cupos + '\'' +
                ", fechaInicioPostulacion=" + fechaInicioPostulacion +
                ", fechaFinPostulacion=" + fechaFinPostulacion +
                ", activo=" + activo +
                '}';
    }
}
