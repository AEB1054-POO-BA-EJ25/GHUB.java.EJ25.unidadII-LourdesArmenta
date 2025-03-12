package miPrincipal;

public class AppForma {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("    CLASE FORMA");
        System.out.println("*******************");
        Forma forma = new Forma();
        System.out.println("El area de un circulo = "+forma.calcularArea(12.75));
        System.out.println("El area de un triángulo = "+forma.calcularArea(5, 10));
        System.out.println("El area del cuadrado = "+forma.calcularArea(3.5F));

        //Creacion del objeto
        /*
         * Formato para definir una referencia a un objeto
         *   NombreClase varRefencia
         * 
         * Formato para crear un crear
         *    varReferencia = new NombreClase(argumentos_constructor)
         */
    }
    
}
