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

        int a = 1250;

        Integer b = 1250;

        System.out.println("Valor de a= "+a);


        System.out.println("Valor de b= "+b.toString());

        System.out.println("Valor de b= "+b);

        Perro p3 = new Perro();
        p3.setNombre("Benito");
        p3.setEdad(8);
        
        System.out.println("Nombre: "+p3.getNombre()+" "+"Edad: "+p3.getEdad());

        System.out.println(p3.toString());

        Calculadora calculadora1 = new Calculadora(5,6);

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5,6));

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5.0,6.5));

        System.out.println("El resultado de la suma = "+calculadora1.sumar(5,6.5));
        //La linea de arriba no marca error poruqe implicitamente conviernte el 5 en double
        // y por lo tanto utilizar el metodos sumar con los dos argumentos double

        Forma forma = new Forma();
        System.out.println("El area de un circulo = "+forma.calcularArea(12.75));
        System.out.println("El area de un triángulo = "+forma.calcularArea(5, 10));
        System.out.println("El area del cuadrado = "+forma.calcularArea(3.5F));

        //Creacion del objeto
        /*
         * Formato para definir una referencia a un objeto
         *   NombreClase varRefencia
         * 
         * Formato para crear un crear
         *    varReferencia = new NombreClase(argumentos_constructor)
         */

         Punto punto1;
         punto1 = new Punto(); //incovocando al constructor vacio

         Punto punto2;
         punto2 = new Punto(2,3);

         System.out.println("Coordenado en punto1:"+punto1.getX()+","+punto1.getY());
         System.out.println("Coordenado en punto2:"+punto2.getX()+","+punto2.getY());

         



















       
    }
}