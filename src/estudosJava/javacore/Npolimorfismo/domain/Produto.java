package estudosJava.javacore.Npolimorfismo.domain;

public abstract class Produto implements Taxavel {
    protected String name;
    protected double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
