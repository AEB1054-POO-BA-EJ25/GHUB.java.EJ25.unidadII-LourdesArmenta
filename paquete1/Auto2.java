package paquete1;

public class Auto2 {
    public long id;
    private String marca;
    private String modelo;
    private int anio;

    public Auto2(long id, String marca, String modelo, int anio){
        this.id=id;
        this.marca =marca;
        this.modelo = modelo;
        this.anio = anio;


    }

    public String obtenerDetalles(){
        return "ID = "+this.id+" Marca: "+this.marca;
    }




}
