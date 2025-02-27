package miPrincipal;
/*
 * sintaxis
 * class NombreClase
 * {
 *   lista de miembros //son metodos y datos miembros de la clase
 * }
 */
import java.util.Scanner;
public class Punto {
    private int x;
    private int y;
    //constructores
    //vacio
    public Punto(){
        this.x = 0;
        this.y = 0;

    }
    //lleno
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Metoso personalizados
    public void desplegar(){
        System.out.print("Valor de x:"+this.x);
        System.out.println("   Valor de y:"+this.y);
        

    }
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el valor de x:");
        this.x = entrada.nextInt();
        System.out.println("Proporciona el valor de y:");
        this.y = entrada.nextInt();


    }
 
    public double calcularDistancia(Punto p){
        double resultado;
        resultado = Math.sqrt(Math.pow((p.getX()-this.x),2) +
                    Math.pow((p.getY()-this.y),2));

        return resultado;

    }
    
    //Getter y setter
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    

    
}
