package estudosJava.javacore.Npolimorfismo.service;

public class FuncionarioPolimorfismo {
    protected String name;
    protected double bonus;
    protected double salario;
    protected String cargo = "Funcionario";

    public FuncionarioPolimorfismo(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O funcionario " + name + " está trabalahndo");
    }

    public double calcularBonus(){
        return salario * bonus;
    }

    public void mostrarBonificacao(){
        System.out.println("----- DADOS DO SALÁRIO -----");
        System.out.println("Nome: "+ name);
        System.out.println("Cargo: " + cargo);
        System.out.println("Bonus pelo cargo: "+bonus * 100 +"%");
        System.out.println("Salario: R$"+salario);
        System.out.println("Valor do bonus: R$"+calcularBonus());
        System.out.println("Salario com bonus: R$"+ (salario + calcularBonus()));
        System.out.println("--------------------------------------");
    }
    
}
