package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.FuncionarioPolimorfismo;

public class GerentePoli extends FuncionarioPolimorfismo{
    public GerentePoli(String name, double salario) {
        super(name, salario);
        bonus = 0.25;
    }

    @Override
    public void mostrarBonificacao() {
        this.cargo = "Gerente";
        super.mostrarBonificacao();
    }

    @Override
    public double calcularBonus() {
        return super.calcularBonus();
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente " + name + " está trabalahndo");
    }
    
}
