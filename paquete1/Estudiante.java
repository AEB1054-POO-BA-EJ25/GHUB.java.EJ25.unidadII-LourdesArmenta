package paquete1;

public class Estudiante {
    //Atributo
    private String nombre;

    //Constructores

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    //Metodo personaliZADO
    public String obtenerDetalles(){
        return "Estudiante: "+nombre;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
