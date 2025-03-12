package miPrincipal;

public class AppAlumno {
    public static void menu(){
        System.out.println("*******************");
        System.out.println("   CLASE ALUMNO");
        System.out.println("*******************");
        //Crear instancias alumno
        Alumno a1 = new Alumno(); //invoco al su constructor vacio
        Alumno a2 = new Alumno("Alicia",20,"23456","Sistemas");

        //invocar al método estudiar de Persona

        a1.estudiar();
        a2.estudiar();

        a1.saludar();
        a2.saludar();
    }
    
}
