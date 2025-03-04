package paquete1;

public class Computadora {
    //Atributis
    private String marca;
    private String modelo;
    private Monitor monitor;

    //Constructores
    
    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }
        

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    

    
    
    
}
