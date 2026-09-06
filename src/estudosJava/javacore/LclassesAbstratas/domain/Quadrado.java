package estudosJava.javacore.LclassesAbstratas.domain;

public class Quadrado extends Formas{
    private double lado;

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerminetro() {
        // TODO Auto-generated method stub
        return lado * 4;
    }

    @Override
    public void resultado() {
        // TODO Auto-generated method stub
        super.resultado();
        System.out.println("Forma: Quadrado");
        System.out.println("------------------------");
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
