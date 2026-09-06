package estudosJava.javacore.LclassesAbstratas.domain;

public class Triangulo extends Formas{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return base * altura / 2;
    }

    @Override
    public double calcularPerminetro() {
        // TODO Auto-generated method stub
        return lado1 + lado2 + base;
    }

    @Override
    public void resultado() {
        // TODO Auto-generated method stub
        super.resultado();
        System.out.println("Forma: Triangulo");
        System.out.println("------------------------");
    }

    public Triangulo(double altura, double base, double lado1, double lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
