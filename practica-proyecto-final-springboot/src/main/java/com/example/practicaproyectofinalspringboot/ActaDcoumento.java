package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ActaDcoumento {

    @NotNull(message = "El ID del acta documento es obligatorio")
    @Positive(message = "El ID del acta documento debe ser un número positivo")
    @Column(nullable = false)
    private Integer idActaDocumento;

    @NotNull(message = "El ID de la convocatoria es obligatorio")
    @Positive(message = "El ID de la convocatoria debe ser un número positivo")
    @Column(nullable = false)
    private Integer idConvocatoria;

    @NotNull(message = "La URL del archivo PDF es obligatoria")
    @Size(max = 500, message = "La URL del archivo PDF no debe exceder los 500 caracteres")
    @Column(nullable = false, length = 500)
    private String urlArchivoPdf;

    @NotNull(message = "El número de acta es obligatorio")
    @Size(max = 50, message = "El número de acta no debe exceder los 50 caracteres")
    @Column(nullable = false, length = 50)
    private String numeroActa;

    @NotNull(message = "El tipo de acta es obligatorio")
    @Size(max = 50, message = "El tipo de acta no debe exceder los 50 caracteres")
    @Column(nullable = false, length = 50)
    private String tipoActa;

    public ActaDcoumento() {
    }

    public ActaDcoumento(Integer idActaDocumento, Integer idConvocatoria, String urlArchivoPdf, String numeroActa, String tipoActa) {
        this.idActaDocumento = idActaDocumento;
        this.idConvocatoria = idConvocatoria;
        this.urlArchivoPdf = urlArchivoPdf;
        this.numeroActa = numeroActa;
        this.tipoActa = tipoActa;
    }

    public Integer getIdActaDocumento() {
        return idActaDocumento;
    }

    public void setIdActaDocumento(Integer idActaDocumento) {
        this.idActaDocumento = idActaDocumento;
    }

    public Integer getIdConvocatoria() {
        return idConvocatoria;
    }

    public void setIdConvocatoria(Integer idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    public String getUrlArchivoPdf() {
        return urlArchivoPdf;
    }

    public void setUrlArchivoPdf(String urlArchivoPdf) {
        this.urlArchivoPdf = urlArchivoPdf;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getTipoActa() {
        return tipoActa;
    }

    public void setTipoActa(String tipoActa) {
        this.tipoActa = tipoActa;
    }

    @Override
    public String toString() {
        return "ActaDcoumento{" +
                "idActaDocumento=" + idActaDocumento +
                ", idConvocatoria=" + idConvocatoria +
                ", urlArchivoPdf='" + urlArchivoPdf + '\'' +
                ", numeroActa='" + numeroActa + '\'' +
                ", tipoActa='" + tipoActa + '\'' +
                '}';
    }
}
