package estudosJava.javacore.Gassociação.domain;
import java.util.Scanner;

public class Estoque {
    private Produtos[] produtos;
    Scanner input = new Scanner(System.in);

    public int idFormatado() {

        int newId = 1;

        if (this.produtos == null) {
            return newId;
        }

        while (true) {

            boolean idExiste = false;

            for (Produtos produto : produtos) {

                if (produto.getId() == newId) {
                    idExiste = true;
                    break;
                }
            }

            if (!idExiste) {
                return newId;
            }

            newId++;
        }
    }
    public int todosProdutos(){
        int todos = 1;
        if (this.produtos == null){
            return todos;
        }
        for (Produtos produto : produtos) {
            todos += 1;
        }
        return todos;
    }
    public void adicionarProduto(){
        System.out.println("Digite o nome do produto:");
        String nomeProduto = input.nextLine();
        System.out.println("Informe o preço da compra:");
        double precoCompra = input.nextDouble();
        System.out.println("Informe o preço de venda:");
        double precoVenda = input.nextDouble();
        System.out.println("Informe a quantidade:");
        int quantidade = input.nextInt();
        input.nextLine();
        System.out.println("Informe a categoria:");
        String categoriaProduto = input.nextLine();
        System.out.println("--------------------------");
        


        Produtos produto = new Produtos(this.idFormatado(),nomeProduto,precoCompra,precoVenda,quantidade,categoriaProduto);
        Produtos[] arrayProdutos = new Produtos[this.todosProdutos()];
        if (this.produtos != null){
            for (int i = 0; i < this.produtos.length; i++){
                arrayProdutos[i] = this.produtos[i];
            }
        }
        arrayProdutos[arrayProdutos.length - 1] = produto;
        this.setProdutos(arrayProdutos);
        System.out.println("Produto criado com sucesso!");
    }

    public void listarProdutos(){
        if (this.produtos == null){
            System.out.println("--------------------------");
            System.out.println("Não existem produtos");
            System.out.println("--------------------------");
            return;
        }
        for (Produtos produto : produtos) {
            System.out.println("ID: "+produto.getId());
            System.out.println("Nome: "+produto.getName());
            System.out.println("Preço de compra: R$"+produto.getPrecoCompra());
            System.out.println("Preço de venda: R$"+produto.getPrecoVenda());
            System.out.println("Quantidade: "+produto.getQuantidade());
            System.out.println("Categoria: "+produto.getCategoria());
            System.out.println("---------------------------------------");
        }
    }


    public Produtos[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos[] produtos) {
        this.produtos = produtos;
    }
    
}
