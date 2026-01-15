package com.example.practicaproyectofinalspringboot;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;


import java.sql.Date;

@SpringBootApplication
public class PracticaProyectoFinalSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticaProyectoFinalSpringbootApplication.class, args);

        Rol rol = new Rol();
        rol.setIdRol(3);
        rol.setNombreRol("Decano");

        validarParametros(rol);
        System.out.println(rol);


        Usuario usuario = new Usuario();
        usuario.setIdUsuario(7);
        usuario.setCedula("12345678901234567890123456789012345678901234567890");
        usuario.setNombres("Darwin Joel");
        usuario.setApellidos("Sanchez Vera");
        usuario.setCorreo("example@uteq.edu.ec");
        usuario.setTelefono("1234567890");
        usuario.setNombreUsuario("admin");
        usuario.setCredencialUsuario("admin");
        usuario.setActivo(true);
        usuario.setFechaCreacion(LocalDate.parse("1996-07-04"));

        validarParametros(usuario);
        System.out.println(usuario.toString());


        Facultad facultad = new Facultad();
        facultad.setIdFacultad(5);
        facultad.setIdUsuarioDecano(rol.getIdRol());
        facultad.setNombreFacultad("");

        validarParametros(facultad);
        System.out.println(facultad);


        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setIdRol(rol.getIdRol());
        usuarioRol.setIdUsuario(usuario.getIdUsuario());
        usuarioRol.setIdFacultad(facultad.getIdFacultad());

        validarParametros(usuarioRol);
        System.out.println(usuarioRol.toString());
    }

    public static <T> void validarParametros(T objeto) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<T>> violations = validator.validate(objeto);

        if (!violations.isEmpty()) {
            System.out.println("\n\n=================== ERRORES EN: " + objeto.getClass().getSimpleName() + " ===================");
            for (ConstraintViolation<T> violation : violations) {
                System.out.println("Campo: " + violation.getPropertyPath());
                System.out.println("Error: " + violation.getMessage());
                System.out.println("Valor rechazado: [" + violation.getInvalidValue() + "]");
                System.out.println("=============================================================\n");
            }
        }
    }
}
