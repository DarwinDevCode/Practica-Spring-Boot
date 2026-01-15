package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public class Asignatura {

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false, unique = true)
    private Integer idAsignatura;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false)
    private Integer idCarrera;

    @NotNull(message = "No puede estar vacio")
    @Size(max = 150, message = "Se excedio la cantidad de caracteres")
    @Column(nullable = false)
    private String nombreAsignatura;

    @NotNull(message = "No puede estar vacio")
    @Positive(message = "No se aceptan negativos")
    @Column(nullable = false)
    private Integer semestre;

    public Asignatura() {
    }

    public Asignatura(Integer idAsignatura, Integer idCarrera, String nombreAsignatura, Integer semestre) {
        this.idAsignatura = idAsignatura;
        this.idCarrera = idCarrera;
        this.nombreAsignatura = nombreAsignatura;
        this.semestre = semestre;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idAsignatura=" + idAsignatura +
                ", idCarrera=" + idCarrera +
                ", nombreAsignatura='" + nombreAsignatura + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}
