package estudosJava.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO_PORCENTO = 0.25;
    public Computador(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto sobre o computador");
        return this.price * IMPOSTO_PORCENTO;
    }
    
}
