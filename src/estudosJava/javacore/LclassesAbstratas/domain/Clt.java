package estudosJava.javacore.LclassesAbstratas.domain;

public class Clt extends TrabalhadorAbstract{

    public Clt(String cpf, String name, double salary) {
        super(cpf, name, salary);
    }

    @Override
    public void calcularSalario() {
        this.salary += 600;
        System.out.println("Seu sálario com bonus aplicado é R$"+salary);
        
    }

    @Override
    public void trabalhar() {
        System.out.println("Nome do funcionario: "+name);
        System.out.println("CPF do funcionario: "+cpf);
        System.out.println("Status: Trabalhando na empresa JAVA");
        System.out.println("-----------------------------------");

    }
    
}
