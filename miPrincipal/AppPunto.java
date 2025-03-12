package miPrincipal;

public class AppPunto {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("    CLASE PUNTO");
        System.out.println("*******************");
        
        Punto punto1;
        punto1 = new Punto(); //incovocando al constructor vacio

        Punto punto2;
        punto2 = new Punto(2,3);

        System.out.println("Coordenado en punto1:"+punto1.getX()+","+punto1.getY());
        System.out.println("Coordenado en punto2:"+punto2.getX()+","+punto2.getY());

        punto1.desplegar();
        punto2.desplegar();

        punto1.leer();
        punto2.leer();
       
        punto1.desplegar();
        punto2.desplegar();

        double d = punto1.calcularDistancia(punto2);
        System.out.println("La distancia entre los puntos = "+d);
    }
    
}
