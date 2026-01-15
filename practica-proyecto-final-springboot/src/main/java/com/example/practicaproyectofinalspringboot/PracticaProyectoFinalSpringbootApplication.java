package com.example.practicaproyectofinalspringboot;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

@SpringBootApplication
public class PracticaProyectoFinalSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticaProyectoFinalSpringbootApplication.class, args);

        //Instancia de las clases
        ActaDcoumento actaDocumento = new ActaDcoumento();
        Asignatura asignatura = new Asignatura();
        Carrera carrera = new Carrera();
        CatalogoEstado catalogoEstado = new CatalogoEstado();
        Convocatoria convocatoria = new Convocatoria();
        EvaluacionMeritos evaluacionMeritos = new EvaluacionMeritos();
        Facultad  facultad = new Facultad();
        PeriodoAcademico  periodoAcademico = new PeriodoAcademico();
        Postulacion postulacion = new Postulacion();
        Rol rol = new Rol();
        Usuario usuario = new Usuario();
        UsuarioRol usuarioRol = new UsuarioRol();


        //Inserción y validación de información
        rol.setIdRol(3);
        rol.setNombreRol("Decano");

        validarParametros(rol);
        System.out.println(rol);


        usuario.setIdUsuario(7);
        usuario.setCedula("1234567890");
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


        facultad.setIdFacultad(5);
        facultad.setIdUsuarioDecano(rol.getIdRol());
        facultad.setNombreFacultad("Facultad Ciencias de la Computacion y Diseño Digital");

        validarParametros(facultad);
        System.out.println(facultad);


        usuarioRol.setIdRol(rol.getIdRol());
        usuarioRol.setIdUsuario(usuario.getIdUsuario());
        usuarioRol.setIdFacultad(facultad.getIdFacultad());

        validarParametros(usuarioRol);
        System.out.println(usuarioRol.toString());


        asignatura.setIdAsignatura(1);
        asignatura.setIdCarrera(4);
        asignatura.setNombreAsignatura("Carrera de Software");
        asignatura.setSemestre(10);

        validarParametros(asignatura);
        System.out.println(asignatura.toString());


        convocatoria.setIdConvocatoria(1);
        convocatoria.setIdPeriodoAcademico(1);
        convocatoria.setIdAsignatura(1);
        convocatoria.setIdUsuarioDocente(1);
        convocatoria.setCodigo("ALFAKI");
        convocatoria.setCupos(10);
        convocatoria.setFechaInicioPostulacion(LocalDate.now());
        convocatoria.setFechaFinPostulacion(LocalDate.parse("2026-01-20"));
        convocatoria.setActivo(true);

        validarParametros(convocatoria);
        System.out.println(convocatoria.toString());


        catalogoEstado.setIdCatalogoEstado(1);
        catalogoEstado.setNombreEstado("En proceso");
        catalogoEstado.setModulo("4");

        validarParametros(catalogoEstado);
        System.out.println(catalogoEstado.toString());


        postulacion.setIdPostulacion(1);
        postulacion.setIdConvocatoria(1);
        postulacion.setIdUsuarioPostulante(1);
        postulacion.setIdEstadoPostulacion(1);
        postulacion.setFechaPostulacion(LocalDate.parse("2026-01-05"));

        validarParametros(postulacion);
        System.out.println(postulacion.toString());
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