package biblioteca;

public class Autor {
    //Atributos
    private int idNombre;
    private String nombre;
    private String nacionalidad;

    //constructores
    public Autor() {
    }
    public Autor(int idNombre, String nombre, String nacionalidad) {
        this.idNombre = idNombre;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    

    //Métodos personalizado
    public void gregarLibro(Libro libro){

    }



    //getter y setter
    public int getIdNombre() {
        return idNombre;
    }
    public void setIdNombre(int idNombre) {
        this.idNombre = idNombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    

    
}
