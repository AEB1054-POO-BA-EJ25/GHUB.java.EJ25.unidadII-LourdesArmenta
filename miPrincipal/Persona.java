package miPrincipal;
public class Persona{
    private String nombre;
    private int edad;
    private String dni;

    //Métodos constructores
    //Vacio
    public Persona(){

    }
    //Lleno
    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //Métodos Personalizados
    public saludar(){
        System.out.println("Hola Mundo, soy una persona");
    }

}