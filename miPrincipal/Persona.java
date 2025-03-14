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
    public void saludar(){
        System.out.println("Hola Mundo, soy una persona");
    }

    //Definir Propiedades
    //Lee el atributo nombre y lo regresa
    public String getNombre(){
        return this.nombre;
    }
    //Asignar un nombre al atributo nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    //Lee el atributo edad y lo regresa
    public int getEdad(){
        return this.edad;
    }

    //asigna el parametro edad al atributo edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Lee el atributo DNI y lo regresa
    public String getDni(){
        return this.dni;
    }

    //asigna el parametro DNI al atributo DNI
    public void setDni(String dni){
        this.dni = dni;
    }
}