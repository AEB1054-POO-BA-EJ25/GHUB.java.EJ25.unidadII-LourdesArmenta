package miPrincipal;

public class AppPersona {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("   CLASE PERSONA");
        System.out.println("*******************");
        //crear una instancia de la clase persona
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
     

        //invoco al método saludar de Persona
        p1.saludar();
        p2.saludar();
    }
    
}
