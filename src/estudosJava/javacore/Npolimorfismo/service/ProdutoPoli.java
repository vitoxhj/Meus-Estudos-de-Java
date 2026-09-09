package estudosJava.javacore.Npolimorfismo.service;

public abstract class ProdutoPoli {
    private String name;
    private double price;
    private String type;

    public ProdutoPoli(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void mostrarDados(){
        System.out.println("----- DADOS DO PRODUTO -----");
        System.out.println("Tipo do produto: " + type);
        System.out.println("Nome do produto: " + name);
        System.out.println("Preço: R$" + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
