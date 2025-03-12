package miPrincipal;

import paquete1.Computadora;
import paquete1.Monitor;

public class AppComputadora {
    public static void menu(){
        System.out.println("************************");
        System.out.println("    CLASE COMPUTADORA");
        System.out.println("***********************");
         //demostracion de la relación de agregacion

        //Forma1
        Monitor monitor1 = new Monitor("Dell",20);
        Computadora compu1 = new Computadora("HP","ML45",monitor1);

        //Forma2

        Computadora compu2 = new Computadora("Acer","A25",new Monitor("Acer",16));
        
        //Forma3

        Computadora compu3 = new Computadora("LANIX","SM",null);

        //Forma1
        System.out.println("La computadora marca: "+compu1.getMarca()+
                            " Modelo: "+compu1.getModelo()+"\n"+
                            "Monitor Marca: "+compu1.getMonitor().getMarca()+
                            " Tamanio:"+compu1.getMonitor().getTamanio());

        //Forma2

        String marcaCompu = compu2.getMarca();
        String modeloCompu = compu2.getModelo();
        
        Monitor monitor = compu2.getMonitor();
        String marcaMonitor = monitor.getMarca();
        int tamMonitor= monitor.getTamanio();

        System.out.println("Computadora 2 Marca: "+marcaCompu+" Modelo: "+modeloCompu+
                            "\nMonitor Marca: "+marcaMonitor+" Tammanio: "+tamMonitor);


        compu3.setMonitor(new Monitor("apple",30)); 

        System.out.println("La computadora3 marca: "+compu3.getMarca()+
                            " Modelo: "+compu3.getModelo()+"\n"+
                            "Monitor Marca: "+compu3.getMonitor().getMarca()+
                            " Tamanio:"+compu3.getMonitor().getTamanio());
        
        
        
        Monitor monitor2 = new Monitor("LG",25);
        Computadora compu4 = new Computadora("Toshiba","XL",monitor2);

        System.out.println(compu4.obtenerDetalles());
    }

        
    
}
