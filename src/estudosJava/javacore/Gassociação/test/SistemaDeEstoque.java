package estudosJava.javacore.Gassociação.test;

import java.util.Scanner;

import estudosJava.javacore.Gassociação.domain.Estoque;

public class SistemaDeEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();
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
                case 4 -> estoque.listarProdutos();
            }
        }
        input.close();
    }
    
}
