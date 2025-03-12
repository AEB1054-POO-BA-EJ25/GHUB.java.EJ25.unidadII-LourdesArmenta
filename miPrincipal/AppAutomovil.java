package miPrincipal;

import automovil.Automovil;
import automovil.Motor;

public class AppAutomovil {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("    CLASE AUTOMOVIL");
        System.out.println("*******************");
         //uso del paquete automovil
         Automovil auto = new Automovil();
         auto.setMarca("Honda");
         auto.setModelo("CRV");

         Motor motor = new Motor("5.0",460);

         auto.setMotor(motor);

         System.out.println("El automovil: "+auto.getMarca()+" "+
                            auto.getModelo()+" tien un motor: "+
                            auto.getMotor().getTipo()+" Potencia:"+auto.getMotor().getPotencia());

        Automovil auto2 = new Automovil("Ford","Lobo","6.0",60000);

        System.out.println("El automovil: "+auto2.getMarca()+" "+
                            auto2.getModelo()+" tien un motor: "+
                            auto2.getMotor().getTipo()+" Potencia:"+auto2.getMotor().getPotencia());
        
    }
    
        
    
}
