package estudosJava.javacore.LclassesAbstratas.domain;

public class Retangulo extends Formas{
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return base * altura;
    }

    @Override
    public double calcularPerminetro() {
        // TODO Auto-generated method stub
        return 2 * (base + altura);
    }

    @Override
    public void resultado() {
        // TODO Auto-generated method stub
        super.resultado();
        System.out.println("Forma: Retangulo");
        System.out.println("------------------------");
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
