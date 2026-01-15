package com.example.practicaproyectofinalspringboot;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class Usuario {
    @NotNull(message = "El ID de usuario es obligatorio")
    @Positive(message = "El ID de usuario debe ser un número positivo")
    @Column(nullable = false)
    private Integer idUsuario;

    @NotBlank(message = "La cédula no puede estar vacía")
    @Size(max = 15, message = "La cédula no puede exceder los 15 caracteres")
    @Column(nullable = false, unique = true, length = 15)
    private String cedula;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String nombres;

    @NotBlank(message = "El apellido es obligatorio")
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String apellidos;

    @Email(message = "Formato de correo inválido")
    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, unique = true, length = 100)
    private String correo;

    @NotBlank
    @Size(max = 20)
    @Column(nullable = false, length = 20)
    private String telefono;

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, unique = true, length = 100)
    private String nombreUsuario;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String credencialUsuario;

    @NotNull(message = "El estado activo es obligatorio")
    @Column(nullable = false)
    private Boolean activo;

    @NotNull
    @PastOrPresent(message = "La fecha no puede ser futura")
    @Column(nullable = false)
    private LocalDate fechaCreacion;

    public Usuario() {}

    public Usuario(String cedula, String nombres, String apellidos, String correo, String telefono, String nombreUsuario, String credencialUsuario, Boolean activo, LocalDate fechaCreacion) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreUsuario = nombreUsuario;
        this.credencialUsuario = credencialUsuario;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCredencialUsuario() {
        return credencialUsuario;
    }

    public void setCredencialUsuario(String credencialUsuario) {
        this.credencialUsuario = credencialUsuario;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cedula='" + cedula + '\n' +
                "nombres='" + nombres + '\n' +
                "apellidos='" + apellidos + '\n' +
                "correo='" + correo + '\n' +
                "telefono='" + telefono + '\n' +
                "nombreUsuario='" + nombreUsuario + '\n' +
                "credencialUsuario='" + credencialUsuario + '\n' +
                "activo=" + activo + '\n' +
                "fechaCreacion=" + fechaCreacion +
                '}';
    }


}
