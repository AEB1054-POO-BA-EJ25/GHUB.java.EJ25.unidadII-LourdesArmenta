package paquete1;

public class Profesor {
    private String nombre;

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    //Mérodos personalizados
    public void ensenar(Estudiante est){
        System.out.println("El profesor "+this.nombre+" esta enseñando al Estudiante: "+est.getNombre());
    }

    public String obtenerDetalles(){
        return "Profesor: "+this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
