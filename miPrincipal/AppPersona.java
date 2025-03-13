package miPrincipal;

import java.util.Scanner;

public class AppPersona {
    public static void menu(){
        //crear un menu de opciones
        Persona lista[] = new Persona[5]; //crea un arrego con capacidad para almacenar 5 personas

        //indice para agredar personas
        int i = 0;

        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("*******************");
            System.out.println("   CLASE PERSONA");
            System.out.println("*******************");
            System.out.println("1) Agregar");
            System.out.println("2) Eliminar");
            System.out.println("3) Modificar");
            System.out.println("4) Consular");
            System.out.println("\t 0 salir");

            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    teclado.nextLine(); //limpia el buffer del tecladomaria 
                    //solitar dator por el teclado para crear un objeto persona
                    System.out.print("Proporciona nombre:");
                    String nombre = teclado.nextLine();

                    System.out.print("Proporciona Edad:");
                    int edad = teclado.nextInt();

                    System.out.println("proporciona DNI:");
                    String dni = teclado.next();

                    Persona p1 = new Persona(nombre,edad,dni);

                    lista[i]=p1;
                    i++;



                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:
                    teclado.nextLine(); //limpio el buffer
                    System.out.println("Dame la posicion de la persona que quieres consultar:");
                    int pos = teclado.nextInt();
                    Persona p2 = lista[pos];
                    System.out.println("Nombre de la persona: "+p2.getNombre());
                    System.out.println("Edad de la persona: "+p2.getEdad());
                    System.out.println("DNI de la persona: "+p2.getDni());


                    break;
                case 0:

                    return;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");

            }
        } while (opc !=0);
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
