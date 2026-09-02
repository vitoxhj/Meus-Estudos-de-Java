package estudosJava.javacore.Kenums.domain;

public class ProdutoEstoque {
    private int id;
    private String name;
    private double price;
    private int quant;
    private CategoriaEnum categoria;
    private StatusProduto statusProduto;

    public ProdutoEstoque(CategoriaEnum categoria, int id, String name, double price, int quant) {
        this.categoria = categoria;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public void adicionarEstoque(int quant){
        if (quant <= 0){
            System.out.println("Adicione pelo menos 1 produto");
            System.out.println("--------------------------------");
            return;
        }
        quant += this.quant;
        this.setQuant(quant);
        System.out.println("Produto adicionado!");
        System.out.println("--------------------------------");
    }

    public void removerEstoque(int quant){
        if (quant <= 0 || quant > this.quant){
            System.out.println("Remova pelo menos um produto o um valor menor no que existe no estoque");
            System.out.println("--------------------------------");
            return;
        }
        int total;
        total = this.quant - quant;
        this.setQuant(total);
        System.out.println("Produto removido!");
        System.out.println("--------------------------------");
    }

    public void mostrarProduto(){
        System.out.println("--- PRODUTO ---");
        System.out.println("ID: "+id);
        System.out.println("Nome: "+name);
        System.out.println("Preço: R$"+price);
        System.out.println("Quantidade: "+quant);
        System.out.println("Categoria: "+categoria.name());
        StatusProduto status = StatusProduto.INATIVO;
        if (this.quant > 0) {
            status = StatusProduto.DISPONIVEL;
        }else if (this.quant == 0){
            status = StatusProduto.ESGOTADO;
        }
        System.out.println("Status: "+status.name());
        System.out.println("--------------------------------");
            
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public StatusProduto getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(StatusProduto statusProduto) {
        this.statusProduto = statusProduto;
    }

    
}
