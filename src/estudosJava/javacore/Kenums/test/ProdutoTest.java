package estudosJava.javacore.Kenums.test;

import estudosJava.javacore.Kenums.domain.CategoriaEnum;
import estudosJava.javacore.Kenums.domain.ProdutoEnum;

public class ProdutoTest {
    public static void main(String[] args) {
        ProdutoEnum produto1 = new ProdutoEnum(CategoriaEnum.ELETRONICO, "Notebook ASUS", 3500);
        ProdutoEnum produto2 = new ProdutoEnum(CategoriaEnum.ALIMENTO, "Cesta básica", 200);
        ProdutoEnum produto3 = new ProdutoEnum(CategoriaEnum.MOVEIS, "Cama King", 1500);
        ProdutoEnum produto4 = new ProdutoEnum(CategoriaEnum.ROUPA, "Camisa polo", 50);
        ProdutoEnum[] produtos = {produto1,produto2,produto3,produto4};
        for (ProdutoEnum produto : produtos) {
            produto.imprimir();
        }

    }
    
}
