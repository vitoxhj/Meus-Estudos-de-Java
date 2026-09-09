package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.domain.ProdutoDigital;
import estudosJava.javacore.Npolimorfismo.domain.ProdutoFisico;
import estudosJava.javacore.Npolimorfismo.service.ProdutoPoli;

public class Ecommerce {
    public static void main(String[] args) {
        ProdutoDigital produto1 = new ProdutoDigital("Rtx 5090", 5000);
        ProdutoFisico produto2 = new ProdutoFisico("Micro-ondas", 1500);
        ProdutoDigital produto3 = new ProdutoDigital("PS5", 3800);
        ProdutoFisico produto4 = new ProdutoFisico("Mesa", 3000);

        ProdutoPoli[] produtos = {produto1, produto2, produto3, produto4};

        for (ProdutoPoli produto : produtos) {
            produto.mostrarDados();
            
        }
    }
}
