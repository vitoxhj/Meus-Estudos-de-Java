package estudosJava.javacore.Gassociação.test;

import estudosJava.javacore.Gassociação.domain.Estoque;
import estudosJava.javacore.Gassociação.domain.Produtos;
import java.util.Scanner;

public class SistemaDeEstoque {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Estoque estoque = new Estoque();
            //Produtos para teste
            Produtos produto1 = new Produtos(1,"Coca",8,12,45,"Bebidas");
            Produtos produto2 = new Produtos(2,"Leite",10,15,90,"Laticinos");
            Produtos produto3 = new Produtos(3,"Suco de morango",5,8,200,"Bebidas");
            Produtos produto4 = new Produtos(4,"Arroz",6,12,500,"Graos");
            Produtos produto5 = new Produtos(5,"Picanha",200,500,25,"Carnes");
            Produtos produto6 = new Produtos(6,"Suco de laranja",6,9,200,"Bebidas");
            Produtos[] arrayProdutos = {produto1,produto2,produto3,produto4,produto5,produto6};
            estoque.setProdutos(arrayProdutos);
            int option = 0;
            while (option != 7){
                System.out.println("===== SISTEMA DE ESTOQUE =====");
                System.out.println("1-Adicionar Produto\n2-Remover produto\n3-Buscar Produto");
                System.out.println("4-Listar Produtos\n5-Adicionar Estoque\n6-Remover Estoque");
                System.out.println("7-Sair");
                System.out.println("==============================");
                System.out.println("Escolha uma opção:");
                option = input.nextInt();
                switch (option) {
                    case 1 -> estoque.adicionarProduto();
                    case 2 -> estoque.removerProduto();
                    case 3 -> estoque.buscarProduto();
                    case 4 -> estoque.listarProdutos();
                    case 5 -> estoque.adicionarEstoque();
                    case 6 -> estoque.removerEstoque();
                    case 7 -> System.out.println("--- SAINDO DO PROGRAMA ---");
                    default -> System.out.println("Esta opção não existe");
                }
            }
        }
    }
    
}
