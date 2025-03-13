package miPrincipal;

import paquete1.Estudiante;
import paquete1.Profesor;

public class AppEstudiante {
    public static void menu(){
        System.out.println("************************");
        System.out.println("    CLASE ESTUDIANTE");
        System.out.println("***********************");
        
        //Relacion de asociacion

        Estudiante estudiante1 = new Estudiante("Pedro Lopez");
        Profesor profesor1 = new Profesor("Ludovico Peluche");

        System.out.println(profesor1.obtenerDetalles());
        System.out.println(estudiante1.obtenerDetalles());

        profesor1.ensenar(estudiante1);
    }
    
}
