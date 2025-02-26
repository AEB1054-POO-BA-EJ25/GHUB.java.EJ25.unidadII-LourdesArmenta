package miPrincipal;

public class Edad {
    private int edadHijo;
    private int edadMadre;
    private int edadPadre;

    //constructor vacio
    public Edad() {
    }

    //constructor lleno
    public Edad(int edadHijo, int edadMadre, int edadPadre) {
        this.edadHijo = edadHijo;
        this.edadMadre = edadMadre;
        this.edadPadre = edadPadre;
    }

    //Metodos Personalizados

    public int difPadreHijo(){
        return this.edadPadre-this.edadHijo;
    }

    public int difMadreHijo(){
        return this.edadMadre-this.edadHijo;

    }

    public int difPadreMadre(){
        if(this.edadMadre>this.edadMadre)
           return this.edadPadre-this.edadHijo;
        else if (this.edadMadre<this.edadMadre)
             return this.edadMadre-this.edadHijo;
        else
           return 0;
    }

    //Getter y Setter
    public int getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(int edadHijo) {
        this.edadHijo = edadHijo;
    }

    public int getEdadMadre() {
        return edadMadre;
    }

    public void setEdadMadre(int edadMadre) {
        this.edadMadre = edadMadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    

    
    
    
}
