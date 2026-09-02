package estudosJava.javacore.Kenums.domain;

public class ProdutoEnum {
    private String name;
    private double price;
    private CategoriaEnum categoria;

    public ProdutoEnum(CategoriaEnum categoria, String name, double price) {
        this.categoria = categoria;
        this.name = name;
        this.price = price;
    }

    public void imprimir(){
        System.out.println("--- PRODUTO ---");
        System.out.println("Nome: "+this.name);
        System.out.println("Preço: R$" + this.price);
        System.out.println("Categoria: "+categoria.name());
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

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

}
