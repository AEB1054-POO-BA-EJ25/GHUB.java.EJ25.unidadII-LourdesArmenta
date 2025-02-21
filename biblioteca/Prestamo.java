package biblioteca;

import java.util.Date;

public class Prestamo{
    //Atributos
    private int idPrestamo;
    private Date fechaInicio;
    private Date fechaFin;
    private Ejemplar ejemplar;
    private Persona persona;
    //Constructores
    public Prestamo() {
    }
    
    public Prestamo(int idPrestamo, Date fechaInicio, Date fechaFin) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Prestamo(int idPrestamo, Date fechaInicio, Date fechaFin, Ejemplar ejemplar, Persona persona) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ejemplar = ejemplar;
        this.persona = persona;
    }

    //Métodos personalizados
    public Date calcularFechaFin(Date fecha, int dias){
        return null;

    }

    public boolean renovarPrestamo(int dias){
        return true;

    }

    public void devolverLibro(){

    }

    public String consultarInformacionPrestamo(){
        return null;

    }

    //Getter y Setter

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    

    
}