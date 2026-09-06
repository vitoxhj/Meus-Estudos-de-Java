package estudosJava.javacore.LclassesAbstratas.domain;

public class Pj extends TrabalhadorAbstract{

    public Pj(String cpf, String name, double BruteValue) {
        super(cpf, name, BruteValue);
    }

    @Override
    public void calcularSalario() {
        double value = this.salary * 0.2;
        this.salary -= value;
        System.out.println("Seu valor com impostos atribuidos é R$"+salary);
        
    }

    @Override
    public void trabalhar() {
        System.out.println("Nome da empresa: "+name);
        System.out.println("CPF da empresa: "+cpf);
        System.out.println("Sua empresa está em funcionamento");
        System.out.println("-----------------------------------");
    }
    
}
