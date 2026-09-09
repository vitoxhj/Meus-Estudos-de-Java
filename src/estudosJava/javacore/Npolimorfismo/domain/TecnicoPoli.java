package estudosJava.javacore.Npolimorfismo.domain;

import estudosJava.javacore.Npolimorfismo.service.FuncionarioPolimorfismo;

public class TecnicoPoli extends FuncionarioPolimorfismo{
    public TecnicoPoli(String name, double salario) {
        super(name, salario);
        bonus = 0.15;
    }

    @Override 
    public void trabalhar(){
        System.out.println("O tecnico " + name + " está trabalahndo");
    }

    @Override
    public void mostrarBonificacao() {
        // TODO Auto-generated method stub
        this.cargo = "Tecnico";
        super.mostrarBonificacao();
    }

    @Override
    public double calcularBonus() {
        // TODO Auto-generated method stub
        return super.calcularBonus();
    }
}
