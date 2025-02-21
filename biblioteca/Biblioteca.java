package biblioteca;

public class Biblioteca {
    //Atributos
    private int idBiblioteca;
    private String nombre;
    private String direccion;

    //Constructores
    public Biblioteca() {
    }

    public Biblioteca(int idBiblioteca, String nombre, String direccion) {
        this.idBiblioteca = idBiblioteca;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Métodos personalizados
    public void agregarLibro(Libro libro){

    }

    public void quitarLibro(Libro libro){
        
    }

    //Getter y Setter
    public int getIdBiblioteca() {
        return idBiblioteca;
    }
    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    
    
}
