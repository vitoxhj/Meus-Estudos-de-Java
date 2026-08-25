package estudosJava.javacore.Dconstrutores.domain;

public class Products {
    private String product;
    private double price;
    private int quantity;

    public Products(String name, double price, int quantity){
        this.product = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int quantity){
        this.quantity += quantity;
        System.out.println("Estoque adicionado: "+quantity+" produtos");
        System.out.println("------------------------------");
    }
    public void removeStock(int quantity){
        if (quantity > this.quantity){
            System.out.println("Quantidade indisponivel");
            System.out.println("------------------------------");
            return;
        }
        this.quantity -= quantity;
        System.out.println("Estoque removido: "+quantity+" produtos");
        System.out.println("------------------------------");
    }

    public void view(){
        System.out.println("Nome: "+this.product);
        System.out.println("Preço: "+this.price);
        System.out.println("Quantidade: "+this.quantity);
        System.out.println("------------------------------");
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
