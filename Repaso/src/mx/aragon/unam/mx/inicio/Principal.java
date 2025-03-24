package mx.aragon.unam.mx.inicio;

import mx.aragon.unam.mx.modelo.Alumno;
import mx.aragon.unam.mx.modelo.Celular;
import mx.aragon.unam.mx.modelo.Persona;
import mx.aragon.unam.mx.modelo.Profesor;

public class Principal {
    public static void main(String[] args) {
        Alumno alumnoUno=new Alumno();
        alumnoUno.setNombre("alumno1");
        alumnoUno.setApellidoPaterno("apellido1");
        alumnoUno.setCelular(new Celular());
        alumnoUno.setNumeroCuenta("322260575");

        System.out.println(alumnoUno.toString());

        System.out.println("---------------");

        Profesor profesor=new Profesor();
        profesor.setNombre("Profesor1");
        profesor.setApellidoPaterno("apellido_paterno_1");
        profesor.setCelular(new Celular());
        profesor.setNumeroTrabajador("01562187");

        System.out.println(profesor.toString());
    }
}
