package estudosJava.javacore.Npolimorfismo.test;

import estudosJava.javacore.Npolimorfismo.domain.Computador;
import estudosJava.javacore.Npolimorfismo.domain.Tomate;
import estudosJava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer",3500);
        Tomate tomate = new Tomate("Cereja", 6);
        tomate.setValidade("11/11/2026");

        CalculadoraImposto.relatorioImposto(computador);
        CalculadoraImposto.relatorioImposto(tomate);
    }
}