package estudosJava.javacore.Kenums.test;

import estudosJava.javacore.Kenums.domain.CategoriaEnum;
import estudosJava.javacore.Kenums.domain.ProdutoEstoque;

public class EstoqueTest {
    public static void main(String[] args) {
        ProdutoEstoque produto = new ProdutoEstoque(CategoriaEnum.ELETRONICO,
            1,
         "Playstation 5",
        3500,
         10);


         produto.mostrarProduto();
         produto.adicionarEstoque(10);
         produto.removerEstoque(20);
         produto.mostrarProduto();
    }
    
}
