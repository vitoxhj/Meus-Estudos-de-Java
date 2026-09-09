package estudosJava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.05;
    private String validade;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto sobre tomate");
        return this.price * IMPOSTO_PORCENTO;
    }

    public Tomate(String name, double price) {
        super(name, price);
        
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
