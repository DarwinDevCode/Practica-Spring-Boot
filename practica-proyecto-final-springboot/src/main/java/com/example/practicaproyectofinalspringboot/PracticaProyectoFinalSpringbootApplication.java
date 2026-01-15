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
        rol.setNombreRol("Docente");
        rol.setNombreRol("Ayudante");
        rol.setNombreRol("Coordinador");
        rol.setNombreRol("Decano");
        rol.setNombreRol("Administrador");
//        System.out.println("Hola" + rol.toString());
        System.out.println(rol);


        Usuario usuario = new Usuario();
        usuario.setCedula("1234567890");
        usuario.setNombres("Darwin Joel");
        usuario.setApellidos("Sanchez Vera");
        usuario.setCorreo("example@uteq.edu.ec");
        usuario.setTelefono("1234567890");
        usuario.setNombreUsuario("admin");
        usuario.setCredencialUsuario("admin");
        usuario.setActivo(true);
        usuario.setFechaCreacion(LocalDate.parse("1996-07-04"));

        System.out.println(usuario.toString());

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);

        if (!violations.isEmpty()) {
            System.out.println("========= ERRORES DE VALIDACIÓN ENCONTRADOS =========");
            for (ConstraintViolation<Usuario> violation : violations) {
                System.out.println("Campo: " + violation.getPropertyPath());
                System.out.println("Error: " + violation.getMessage());
                System.out.println("Valor rechazado: " + violation.getInvalidValue());
                System.out.println("=============================================================");

            }
        }


    }

}
