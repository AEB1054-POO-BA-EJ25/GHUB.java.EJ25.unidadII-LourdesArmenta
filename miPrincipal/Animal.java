package miPrincipal;
public class Animal{
    private String nombre;
    private int edad;

    public Animal() {
    }
    

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void saludar(){
        System.out.println("El animal "+nombre+" esta saludando");
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

  
    
    
}