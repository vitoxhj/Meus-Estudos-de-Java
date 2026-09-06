package estudosJava.javacore.LclassesAbstratas.domain;

public abstract class VeiculoAbstract{
    protected String model;
    protected String mark;
    protected double price;

    public VeiculoAbstract(String mark, String model, double price) {
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

    public void mostrarDados(){
        System.out.println("=== Veiculo ===");
        System.out.println("Marca: "+mark);
        System.out.println("Modelo: "+model);
        System.out.println("Preço: R$"+price);
    }

    public abstract void acelerar();

    public abstract void freiar();
}
