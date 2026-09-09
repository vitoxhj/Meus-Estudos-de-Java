package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.domain.Computador;
import estudosJava.javacore.Npolimorfismo.domain.Produto;
import estudosJava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 4500);
        CalculadoraImposto.relatorioImposto(produto1);
    }
    
}
