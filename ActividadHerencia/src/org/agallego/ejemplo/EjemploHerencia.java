package org.agallego.ejemplo;

import org.agallego.pooherencia.Alumno;
import org.agallego.pooherencia.Persona;
import org.agallego.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Persona alumno = new Alumno();
        alumno.setNombre("John");
        alumno.setApellido("Gallego");

        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Ruiz");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()+" "+ alumno.getApellido());
        System.out.println("Profesor de "+profesor.getAsignatura()+" : "+profesor.getNombre()+" "+ profesor.getApellido());

    }
}
