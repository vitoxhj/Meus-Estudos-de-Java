package estudosJava.javacore.Gassociação.domain;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Estoque {
    private Produtos[] produtos;
    Scanner input = new Scanner(System.in);

    public int idFormatado() {

        int newId = 1;

        if (this.produtos == null || this.produtos.length == 0) {
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
        for (@SuppressWarnings("unused")Produtos produto : produtos) {
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
            System.arraycopy(this.produtos, 0, arrayProdutos, 0, this.produtos.length);
        }
        arrayProdutos[arrayProdutos.length - 1] = produto;
        this.setProdutos(arrayProdutos);
        System.out.println("Produto criado com sucesso!");
    }

    public void removerProduto(){
        if (this.validarProduto() == false) return;
        
        System.out.println("Informe o id do produto que deseja remover:");
        int removerId = input.nextInt();
        input.nextLine();
        int indice = -1;
        for (Produtos produto : produtos) {
            if (produto.getId() == removerId) {
                indice = removerId;
                break;
            }
        }
        if (indice == -1){
            System.out.println("--------------------------");
            System.out.println("Id inexistente");
            System.out.println("--------------------------");
            return;
        }
        Produtos[] novoArray = new Produtos[produtos.length - 1];
        for (int i = 0, j = 0; i < produtos.length; i++) {
            if (i + 1 != indice){
                novoArray[j] = produtos[i];
                j++;
            }else{
                System.out.println("Produto removido: "+produtos[i].getName());
            }
        }
        this.produtos = novoArray;
        System.out.println("Produto Removido!");
    }

    public void buscarProduto(){
        if (this.validarProduto() == false) return;

        System.out.println("Como desejar buscar:");
        System.out.println("1-Por ID\n2-Por nome\n3-Por preço de compra\n4-Por preço de venda");
        System.out.println("5-Por quantidade\n6-Por categoria\n7-Sair");
        int option = input.nextInt();
        input.nextLine();

        switch(option) {
            case 1 -> {
                System.out.println("Digite o id:");
                int buscarId = input.nextInt();
                input.nextLine();
                int indice = -1;
                for (Produtos produto : produtos) {
                    if (produto.getId() == buscarId) {
                        indice = buscarId;
                    }
                }
                if (indice == -1){
                    System.out.println("Id inexistente");
                    return;
                }
                for (Produtos produto : produtos){
                    if (produto.getId() == indice){
                        this.imprimirProduto(produto);
                    }
                }
            }
            case 2 -> {
                System.out.println("Digite o nome:");
                String buscarNome = input.nextLine();
                boolean existe = false;
                for (Produtos produto : this.produtos) {
                    if (produto.getName().toLowerCase().contains(buscarNome.toLowerCase())){
                        this.imprimirProduto(produto);
                        existe = true;
                    }
                } 
                if (existe == false){
                    System.out.println("--------------------------------");
                    System.out.println("Não existe produto com este nome");
                    System.out.println("--------------------------------");
                }
            }
            case 3 -> {
                System.out.println("Informe o preço de compra maximo que deseja filtrar");
                double buscarCompra = input.nextDouble();
                boolean existe3 = false;
                for (Produtos produto : produtos) {
                    if (produto.getPrecoCompra() <= buscarCompra){
                        this.imprimirProduto(produto);
                        existe3 = true;
                    }
                }
                if (existe3 == false){
                    System.out.println("--------------------------------------------------");
                    System.out.println("Não existe produto com este valor minimo de compra");
                    System.out.println("--------------------------------------------------");
                }
            }
            case 4 -> {
                System.out.println("Informe o preço de venda maximo que deseja filtrar");
                double buscarVenda = input.nextDouble();
                boolean existe4 = false;
                for (Produtos produto : produtos) {
                    if (produto.getPrecoVenda() <= buscarVenda){
                        this.imprimirProduto(produto);
                        existe4 = true;
                    }
                }
                if (existe4 == false){
                    System.out.println("--------------------------------------------------");
                    System.out.println("Não existe produto com este valor minimo de venda");
                    System.out.println("--------------------------------------------------");
                }
            }
            case 5 -> {
                System.out.println("Informe a quantidade maxima que deseja filtrar");
                int buscarQuant = input.nextInt();
                boolean existe5 = false;
                for (Produtos produto : produtos) {
                    if (produto.getQuantidade() <= buscarQuant){
                        this.imprimirProduto(produto);
                        existe5 = true;
                    }
                }
                if (existe5 == false){
                    System.out.println("--------------------------------------------------");
                    System.out.println("Não existe produto com este minimo de quantidade");
                    System.out.println("--------------------------------------------------");
                }
            }
            case 6 -> {
                System.out.println("Categorias criadas");
                System.out.println("----------------------------\n");
                Set<String> categoriasUnicas = new HashSet<>();
                for (Produtos produto : produtos) {
                    if (produto.getCategoria() != null){
                        categoriasUnicas.add(produto.getCategoria());
                    }
                }
                for (String categoria : categoriasUnicas){
                    System.out.println(categoria);
                }
                System.out.println("Qual categoria deseja filtrar:");
                String buscarCategoria = input.nextLine();
                boolean existe6 = false;
                for (Produtos produto : produtos) {
                    if (produto.getCategoria().toLowerCase().equals(buscarCategoria.toLowerCase())){
                        this.imprimirProduto(produto);
                        existe6 = true;
                    }
                }
                if (existe6 == false){
                    System.out.println("-------------------------");
                    System.out.println("Esta categoria não existe");
                    System.out.println("-------------------------");
                }
            }
            case 7 -> {
                System.out.println("---------------");
                System.out.println("Saindo da busca");
                System.out.println("---------------");
            }
            default -> {
                System.out.println("---------------------");
                System.out.println("Está opção não existe");
                System.out.println("---------------------");
            }
        }
    }

    public void listarProdutos(){
        if (this.validarProduto() == false) return;
        for (Produtos produto : produtos) {
            this.imprimirProduto(produto);
        }
    }

    public void adicionarEstoque(){
        if (this.validarProduto() == false) return;

        System.out.println("Informe o id do produto que deseja adicionar:");
        int adicionarId = input.nextInt();
        input.nextLine();
        int indice = -1;
        for (Produtos produto : produtos) {
            if (produto.getId() == adicionarId) {
                indice = adicionarId;
                break;
            }
        }
        if (indice == -1){
            System.out.println("--------------------------");
            System.out.println("Id inexistente");
            System.out.println("--------------------------");
            return;
        }

        for (Produtos produto : produtos) {
            if (produto.getId() == indice) {
                System.out.println("Nome do produto: " + produto.getName());
                System.out.println("Quantidade atual: "+ produto.getQuantidade());
                System.out.println("Quantos produtos deseja adicionar:");
                int adicionar = input.nextInt();
                if (adicionar <= 0){
                    System.out.println("------------------------------");
                    System.out.println("Adicione pelo menos 1 produto");
                    System.out.println("------------------------------");
                    return;
                }
                adicionar += produto.getQuantidade();
                produto.setQuantidade(adicionar);
                System.out.println("Produtos adicionado com sucesso");
            }    
        }
    }

    public void removerEstoque(){
        if (this.validarProduto() == false) return;

        System.out.println("Informe o id do produto que deseja remover:");
        int removerId = input.nextInt();
        input.nextLine();
        int indice = -1;
        for (Produtos produto : produtos) {
            if (produto.getId() == removerId) {
                indice = removerId;
                break;
            }
        }
        if (indice == -1){
            System.out.println("--------------------------");
            System.out.println("Id inexistente");
            System.out.println("--------------------------");
            return;
        }

        for (Produtos produto : produtos) {
            if (produto.getId() == indice) {
                System.out.println("Nome do produto: " + produto.getName());
                System.out.println("Quantidade atual: "+ produto.getQuantidade());
                System.out.println("Quantos produtos deseja remover:");
                int remover = input.nextInt();
                if (remover <= 0 || remover > produto.getQuantidade()){
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("remova pelo menos 1 produto ou remova uma quantidade existente no estoque");
                    System.out.println("-------------------------------------------------------------------------");
                    return;
                }
                int totalRemover;
                totalRemover = produto.getQuantidade() - remover;
                produto.setQuantidade(totalRemover);
                System.out.println("Produtos removido com sucesso");
            }    
        }
    }

    public boolean validarProduto(){
        if (this.produtos == null || this.produtos.length == 0){
            System.out.println("--------------------------");
            System.out.println("Não existem produtos");
            System.out.println("--------------------------");
            return false;
        }
        return true;
    }

    public void imprimirProduto(Produtos produto){
        System.out.println("ID: "+produto.getId());
        System.out.println("Nome: "+produto.getName());
        System.out.println("Preço de compra: R$"+produto.getPrecoCompra());
        System.out.println("Preço de venda: R$"+produto.getPrecoVenda());
        System.out.println("Quantidade: "+produto.getQuantidade());
        System.out.println("Categoria: "+produto.getCategoria());
        System.out.println("---------------------------------------");
    }


    public Produtos[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos[] produtos) {
        this.produtos = produtos;
    }
    
}
