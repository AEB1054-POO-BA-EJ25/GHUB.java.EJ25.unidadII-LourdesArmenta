package biblioteca;
public class Persona{
    //Atributos
    private int idPersona;
    private String nombre;
    private String telefono;

    //constructores
    public Persona(){

    }

    public Persona(int idPersona, String nombre, String telefono){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.telefono = telefono;
    }
     
    //metodos personalizados
    public boolean solicitarPrestamo(Libro libro){
        return true;

    }

    public boolean devolverLibro(Libro libro){
        return true;

    }
    //Propiedades
    public int getIdPersona(){
        return this.idPersona;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }


    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}