package biblioteca;
public class Usuario extends Persona{
    //Atributos
    private int numSocio;

    //Constructores

    public Usuario() {
        
    }

    public Usuario(int idPersona, String nombre, String telefono, int numSocio) {
        super(idPersona, nombre, telefono);
        this.numSocio = numSocio;
    }

    //Métodos personalizados

    public void consultarPrestamos(){

    }

    public void reservarLibros(Libro libro){

    }

    //getter y setter

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    
    


}