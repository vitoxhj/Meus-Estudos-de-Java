package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.ProdutoPoli;
import estudosJava.javacore.Npolimorfismo.service.Vendavel;

public class ProdutoFisico extends ProdutoPoli implements Vendavel{
    public final double frete = 100;
    public ProdutoFisico(String name, double price) {
        super(name, price);
    }

    @Override
    public void mostrarDados() {
        // TODO Auto-generated method stub
        this.setType("Fisico");
        super.mostrarDados();
        System.out.println("Frete: R$" + frete);
        System.out.println("Preço final: R$" + calcularPrecoFinal());
    }

    @Override
    public double calcularPrecoFinal() {
        // TODO Auto-generated method stub
        return this.getPrice() + frete;
    }
    
}
