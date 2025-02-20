package miPrincipal;
public class Gato extends Animal{ 
    private String raza;

    public Gato(){

    }
    public Gato(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza=raza;
    }

    public void saludar(){
        System.out.println("Soy un gato y saludo diciento miau miau");
    }

}