package estudosJava.javacore.LclassesAbstratas.domain;

public class Circulo extends Formas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        
        return 3.14 * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerminetro() {
        // TODO Auto-generated method stub
        return 2 * 3.14 * raio;
    }

    @Override
    public void resultado() {
        // TODO Auto-generated method stub
        super.resultado();
        System.out.println("Forma: Circulo");
        System.out.println("------------------------");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
