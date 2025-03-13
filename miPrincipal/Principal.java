package miPrincipal;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        //crear un menu de opciones
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("**********************");
            System.out.println("    MENU PRINCIPAL");
            System.out.println("**********************");
            System.out.println(" 1) Persona");
            System.out.println(" 2) Alumno");
            System.out.println(" 3) Animal");
            System.out.println(" 4) Calculadora");
            System.out.println(" 5) Forma");
            System.out.println(" 6) Punto");
            System.out.println(" 7) Automovil");
            System.out.println(" 8) Computadora");
            System.out.println(" 9) Estudiante");
            
            System.out.println("\t 0) Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    AppPersona.menu();
                    
                    break;
                case 2:
                    AppAlumno.menu();
                    break;
                case 3:
                    AppAnimal.menu();
                    break;
                case 4:
                    AppCalculadora.menu();
                    break;
                case 5:
                    AppForma.menu();
                    break;
                case 6:
                    AppPunto.menu();
                    break;
                case 7:
                    AppAutomovil.menu();
                    break;
                case 8:
                    AppComputadora.menu();
                    break;
                case 9:
                    AppEstudiante.menu();
                    break;
                case 0:
                   System.out.println("Hasta Luego!");
                   break;
            
                default:
                System.out.println("Opcion incorrecta, intente de nuevo");
            }

        } while (opc !=0);



    

        


       /*/

        Auto2 lista[]= new Auto2[2];
        lista[0]= new Auto2(123L,"Chevrolet", "LT ",2025);
        lista[1]= new Auto2(456L,"Honda","CRV",2010);
        
        Propietario2 prop = new Propietario2(12345,"Lourdes Armenta");
        prop.setListaAutos(lista);

        System.out.println(prop.obtenerDetalles());

        Auto2 []listaAutos = prop.getListaAutos();

        System.out.println("Cantidad de Autos: "+listaAutos.length);

        for (int i=0; i<listaAutos.length;i++){
            System.out.println(listaAutos[i].obtenerDetalles());
        }
         */


         









       
    }
}