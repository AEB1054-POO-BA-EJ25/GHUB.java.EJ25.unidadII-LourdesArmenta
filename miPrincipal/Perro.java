package miPrincipal;
public class Perro extends Animal{
    private String raza;

    public Perro(){

    }
    public Perro(String nombre, int edad, String raza){
        super(nombre,edad);
        this.raza=raza;
    }

    //sobreescribiendo el método saludar que hereda de Animal
    public void saludar(){
        System.out.println("El perro esta saludando y hace gua gua");
    }
    
    @Override
    public String toString() {
        return  getNombre() + " " + getEdad() ;
    }

    

}