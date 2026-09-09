package estudosJava.javacore.Npolimorfismo.service;

import estudosJava.javacore.Npolimorfismo.domain.Produto;
import estudosJava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void relatorioImposto(Produto produto){
        System.out.println("--- Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: "+produto.getName());
        System.out.println("Valor: R$"+produto.getPrice());
        System.out.println("Valor a ser pago: R$"+imposto);
        System.out.println("Valor total: R$" + (produto.getPrice() + imposto));
        if (produto instanceof Tomate tomate){
            System.out.println("Data: "+tomate.getValidade());
        }
    
    }
}
