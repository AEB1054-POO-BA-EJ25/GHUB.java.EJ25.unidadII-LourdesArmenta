package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        //Crear una instancia de la clase Persona
        Persona p1 = new Persona(); //invoco a su constructor vacio
        Persona p2 = new Persona("Juan",18,"12345");

        //Modificar el atributo de p1

        p1.setNombre("Joaquin");
        p1.setEdad(20);
        p1.setDni("555");

        //Leer al objeto p1

        System.out.println("Nombre de p1="+p1.getNombre());
        System.out.println("Edad de p1="+p1.getEdad());
        System.out.println("DNI de p1="+p1.getDni());
        

        Alumno a1 = new Alumno(); //invoco al su constructor vacio
        Alumno a2 = new Alumno("Alicia",20,"23456","Sistemas");

        //invoco al método saludar de Persona
        p1.saludar();
        p2.saludar();


        //invocar al método estudiar de Persona

        a1.estudiar();
        a2.estudiar();

        a1.saludar();
        a2.saludar();


       
    }
}