package miPrincipal;

public class AppCalculadora {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("   CLASE CALCULADORA");
        System.out.println("*******************");
        
        Calculadora calculadora1 = new Calculadora(5,6);

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5,6));

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5.0,6.5));

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5,6.5));
        //La linea de arriba no marca error poruqe implicitamente conviernte el 5 en double
        // y por lo tanto utilizar el metodos sumar con los dos argumentos double
    }
    
}
