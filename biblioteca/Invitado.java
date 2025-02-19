package biblioteca;
public class Invitado extends Persona{
    //Atributos
    private String institucion;
    //constructores

    public Invitado() {

    }

    public Invitado(int idPersona, String nombre, String telefono, String institucion) {
        super(idPersona, nombre, telefono);
        this.institucion = institucion;
    }
    //Métodos personalizados
    public boolean consultarDisponibilidadLibro(Libro libro){
        return true;
    }

    public void solicitarPrestamoTemporalLibro(Libro libro){

    }
    //Getter y Setter
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    



}