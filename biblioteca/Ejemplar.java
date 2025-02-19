package biblioteca;
public class Ejemplar{
    //Atributos

    private Libro libro;
    private int idEjemplar;
    private String numeroDeSerie;
    private boolean disponible;

    //Constructores
    
    public Ejemplar() {
        this.libro = null;
    }

    public Ejemplar(int idEjemplar, String numeroDeSerie, boolean disponible) {
        this.idEjemplar = idEjemplar;
        this.numeroDeSerie = numeroDeSerie;
        this.disponible = disponible;
        this.libro = null;
    }

    public Ejemplar(int idEjemplar, String numeroDeSerie, boolean disponible, Libro libro) {
        this.idEjemplar = idEjemplar;
        this.numeroDeSerie = numeroDeSerie;
        this.disponible = disponible;
        this.libro = libro;
    }
    //Metodos personalizados
    public void prestar(){

    }

    public void devolver(){

    }

    //getter y setter
    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    


}