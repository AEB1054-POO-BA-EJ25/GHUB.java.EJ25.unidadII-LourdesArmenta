package paquete1;

public class Propietario2 {
    private int id;
    private String nombre;
    

    private Auto2 listaAutos[];

    public Propietario2(int id, String nombre){
        this.id =id;
        this.nombre = nombre;
        listaAutos = new Auto2[5];
    }

    public Propietario2(int id, String nombre, Auto2 listaAutos[]){
        this.id =id;
        this.nombre = nombre;
        this. listaAutos = listaAutos;
    }

    public String obtenerDetalles(){
        return "id = "+this.id+" Nombre: "+this.nombre;
    }

    public Auto2 [] getListaAutos(){
        return listaAutos;
    }

    public void setListaAutos(Auto2[] listaAutos){
        this.listaAutos = listaAutos;
    }
    
    







    
}
