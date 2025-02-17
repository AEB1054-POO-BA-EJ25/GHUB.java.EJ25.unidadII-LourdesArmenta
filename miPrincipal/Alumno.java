package miPrincipal;
public class Alumno extends Persona{
    private String curso;
    private int[] notas;

    //Método constructor
    //vacio
    public  Alumno(){

    }
    //lleno
    public Alumno(String nombre, int edad, String dni, String curso){
        super(nombre, edad, dni); //invoca al constructor de la clase padre o base
        this.curso = curso;
        this.notas = new int[5]; //Ejemplo para un alumno que tiene 5 calidicaciones


    }

    //Método personalizado 
    public void estudiar(){
        System.out.println("El alumno  está estudiando");
    }

}