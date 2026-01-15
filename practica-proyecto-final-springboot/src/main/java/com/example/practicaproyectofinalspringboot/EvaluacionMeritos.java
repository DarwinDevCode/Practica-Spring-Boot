package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.DecimalMin;
import java.math.BigDecimal;

public class EvaluacionMeritos {

    @NotNull(message = "El ID de la evaluación de méritos es obligatorio")
    @Positive(message = "El ID de la evaluación de méritos debe ser un número positivo")
    @Column(nullable = false)
    private Integer idEvaluacionMeritos;

    @NotNull(message = "El ID de la postulación es obligatorio")
    @Positive(message = "El ID de la postulación debe ser un número positivo")
    @Column(nullable = false)
    private Integer idPostulacion;

    @Column(nullable = true)
    private Integer idActaDocumento;

    @NotNull(message = "La nota de asignatura es obligatoria")
    @DecimalMin(value = "0.00", message = "La nota de asignatura no puede ser negativa")
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal notaAsignatura;

    @NotNull(message = "La nota de eventos es obligatoria")
    @DecimalMin(value = "0.00", message = "La nota de eventos no puede ser negativa")
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal notaEventos;

    @NotNull(message = "La nota de experiencia es obligatoria")
    @DecimalMin(value = "0.00", message = "La nota de experiencia no puede ser negativa")
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal notaExperiencia;

    @NotNull(message = "La nota de semestres es obligatoria")
    @DecimalMin(value = "0.00", message = "La nota de semestres no puede ser negativa")
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal notaSemestres;

    @NotNull(message = "El total de méritos es obligatorio")
    @DecimalMin(value = "0.00", message = "El total de méritos no puede ser negativo")
    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal totalMeritos;

    public EvaluacionMeritos() {}

    public EvaluacionMeritos(Integer idEvaluacionMeritos, Integer idPostulacion, Integer idActaDocumento,
                             BigDecimal notaAsignatura, BigDecimal notaEventos,
                             BigDecimal notaExperiencia, BigDecimal notaSemestres,
                             BigDecimal totalMeritos) {
        this.idEvaluacionMeritos = idEvaluacionMeritos;
        this.idPostulacion = idPostulacion;
        this.idActaDocumento = idActaDocumento;
        this.notaAsignatura = notaAsignatura;
        this.notaEventos = notaEventos;
        this.notaExperiencia = notaExperiencia;
        this.notaSemestres = notaSemestres;
        this.totalMeritos = totalMeritos;
    }

    public Integer getIdEvaluacionMeritos() {
        return idEvaluacionMeritos;
    }

    public void setIdEvaluacionMeritos(Integer idEvaluacionMeritos) {
        this.idEvaluacionMeritos = idEvaluacionMeritos;
    }

    public Integer getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(Integer idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public Integer getIdActaDocumento() {
        return idActaDocumento;
    }

    public void setIdActaDocumento(Integer idActaDocumento) {
        this.idActaDocumento = idActaDocumento;
    }

    public BigDecimal getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(BigDecimal notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }

    public BigDecimal getNotaEventos() {
        return notaEventos;
    }

    public void setNotaEventos(BigDecimal notaEventos) {
        this.notaEventos = notaEventos;
    }

    public BigDecimal getNotaExperiencia() {
        return notaExperiencia;
    }

    public void setNotaExperiencia(BigDecimal notaExperiencia) {
        this.notaExperiencia = notaExperiencia;
    }

    public BigDecimal getNotaSemestres() {
        return notaSemestres;
    }

    public void setNotaSemestres(BigDecimal notaSemestres) {
        this.notaSemestres = notaSemestres;
    }

    public BigDecimal getTotalMeritos() {
        return totalMeritos;
    }

    public void setTotalMeritos(BigDecimal totalMeritos) {
        this.totalMeritos = totalMeritos;
    }

    @Override
    public String toString() {
        return "EvaluacionMeritos{" +
                "idEvaluacionMeritos=" + idEvaluacionMeritos +
                ", idPostulacion=" + idPostulacion +
                ", idActaDocumento=" + idActaDocumento +
                ", notaAsignatura=" + notaAsignatura +
                ", notaEventos=" + notaEventos +
                ", notaExperiencia=" + notaExperiencia +
                ", notaSemestres=" + notaSemestres +
                ", totalMeritos=" + totalMeritos +
                '}';
    }
}