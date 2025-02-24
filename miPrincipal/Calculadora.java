package miPrincipal;

public class Calculadora {
    //Atributos
    private int a,b,c;
    public Calculadora(){
        a = 0;
        b  = 0;
        c = 0;
    }
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
        
    }
    public Calculadora(int a, int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sumar(int a, int b){
        return a+b;
    }
    public  double sumar(double  num1, double num2){
        return num1+num2;
    }

    public int sumar(int a,int b,int c){
        return a+b+c;
    }

    //Getter y Setter
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

  
    

    
}
