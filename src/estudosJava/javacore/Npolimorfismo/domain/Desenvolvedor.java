package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.FuncionarioPolimorfismo;

public class Desenvolvedor extends FuncionarioPolimorfismo{

    public Desenvolvedor(String name, double salario) {
        super(name, salario);
        bonus = 0.20;
    }

    @Override
    public void mostrarBonificacao() {
        // TODO Auto-generated method stub
        this.cargo = "Desenvolvedor";
        super.mostrarBonificacao();
    }

    @Override
    public double calcularBonus() {
        // TODO Auto-generated method stub
        return super.calcularBonus();
    }

    @Override
    public void trabalhar() {
        // TODO Auto-generated method stub
        System.out.println("O Desenvolvedor " + name + " está trabalahndo");
    }
    
}
