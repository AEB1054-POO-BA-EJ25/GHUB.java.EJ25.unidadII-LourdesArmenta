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
    @Override
    public void saludar(){
      System.out.println("Soy un perro y saludo haciendo gua gua");
   }
    
    
    @Override
    public String toString() {
        return  "Nombre: "+getNombre() + " Edad:" + getEdad() ;
       
    }
        

    

}