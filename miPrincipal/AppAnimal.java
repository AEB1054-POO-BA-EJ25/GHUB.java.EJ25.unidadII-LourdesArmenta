package miPrincipal;

public class AppAnimal {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("   CLASE ANIMAL");
        System.out.println("*******************");
        
        //Sobre escritura de Métodos

        Animal animal1 =new Animal("Hombre",31);

        animal1.saludar();

        Perro perro1 = new Perro("Fiona",1,"Shitzu");

        perro1.saludar();

        Gato gato1 = new Gato("Pani",2,"Persa");

        gato1.saludar();


        Perro perro2=new Perro(); //invoco al constructor vacio

        Perro perro3 = new Perro("Paulino",4,"criollo");

        perro2.setNombre("Firulais");
        perro2.setEdad(1);

        System.out.println(perro2.toString());

        System.out.println(perro2);

        Perro p3 = new Perro();
        p3.setNombre("Benito");
        p3.setEdad(8);
        
        System.out.println("Nombre: "+p3.getNombre()+" "+"Edad: "+p3.getEdad());

        System.out.println(p3.toString());
    }
    
}
