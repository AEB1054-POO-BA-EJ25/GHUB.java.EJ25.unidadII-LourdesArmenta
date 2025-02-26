package miPrincipal;
/*
 * sintaxis
 * class NombreClase
 * {
 *   lista de miembros //son metodos y datos miembros de la clase
 * }
 */

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
