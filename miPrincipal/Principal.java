package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        //Crear una instancia de la clase Persona
        Persona p1 = new Persona(); //invoco a su constructor vacio
        Persona p2 = new Persona("Juan",18,"12345");

        //Modificar el atributo de p1

        p1.setNombre("Joaquin");
        p1.setEdad(20);
        p1.setDni("555");

        //Leer al objeto p1

        System.out.println("Nombre de p1="+p1.getNombre());
        System.out.println("Edad de p1="+p1.getEdad());
        System.out.println("DNI de p1="+p1.getDni());
        

        Alumno a1 = new Alumno(); //invoco al su constructor vacio
        Alumno a2 = new Alumno("Alicia",20,"23456","Sistemas");

        //invoco al método saludar de Persona
        p1.saludar();
        p2.saludar();


        //invocar al método estudiar de Persona

        a1.estudiar();
        a2.estudiar();

        a1.saludar();
        a2.saludar();

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






       
    }
}