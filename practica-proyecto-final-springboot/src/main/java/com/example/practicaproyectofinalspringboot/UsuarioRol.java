package com.example.practicaproyectofinalspringboot;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class UsuarioRol {
    @NotNull(message = "El ID de usuario es obligatorio")
    @Positive(message = "El ID de usuario debe ser un número positivo")
    @Column(nullable = false)
    private Integer idUsuario;

    @NotNull(message = "El ID del rol es obligatorio")
    @Positive(message = "El ID del rol debe ser un número positivo")
    @Column(nullable = false)
    private Integer idRol;

    @NotNull(message = "El ID de la facultad es obligatorio")
    @Positive(message = "El ID de la facultad debe ser un número positivo")
    @Column(nullable = false)
    private Integer idFacultad;

    public UsuarioRol() {}

    public UsuarioRol(Integer idUsuario, Integer idRol, Integer idFacultad) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.idFacultad = idFacultad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    @Override
    public String toString() {
        return "UsuarioRol{" +
                "idUsuario=" + idUsuario +
                ", idRol=" + idRol +
                ", idFacultad=" + idFacultad +
                '}';
    }
}
