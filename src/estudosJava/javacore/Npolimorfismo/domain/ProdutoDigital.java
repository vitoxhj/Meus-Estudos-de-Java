package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.ProdutoPoli;
import estudosJava.javacore.Npolimorfismo.service.Vendavel;

public class ProdutoDigital extends ProdutoPoli implements  Vendavel{
    public final double desconto = 50;
    public ProdutoDigital(String name, double price) {
        super(name, price);
    }

    @Override
    public void mostrarDados() {
        // TODO Auto-generated method stub
        this.setType("Digital");
        super.mostrarDados();
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Preço final: R$" + calcularPrecoFinal());
    }

    @Override
    public double calcularPrecoFinal() {
        // TODO Auto-generated method stub
        return this.getPrice() - desconto;
    }
    
}
