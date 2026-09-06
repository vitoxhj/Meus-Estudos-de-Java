package estudosJava.javacore.LclassesAbstratas.domain;

public abstract class Formas {
    public abstract double calcularArea();

    public abstract double calcularPerminetro();
    
    public void resultado(){
        double area = calcularArea();
        double perimetro = calcularPerminetro();
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro); 
    }
}
