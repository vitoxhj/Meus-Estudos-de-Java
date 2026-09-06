package estudosJava.javacore.LclassesAbstratas.domain;

public class Freelancer extends TrabalhadorAbstract{
    private int quantProjects;

    public Freelancer(String cpf, String name, double ProjectValue, int quantProjects) {
        super(cpf, name, ProjectValue);
        this.quantProjects = quantProjects;
    }

    @Override
    public void calcularSalario() {
        this.salary = this.salary * this.quantProjects;
        System.out.println("Seu sálario neste mês é de R$ "+salary);
        
    }

    @Override
    public void trabalhar() {
        System.out.println("Nome do freelancer: "+name);
        System.out.println("CPF do freelancer: "+cpf);
        System.out.println("O freelancer está disponivel");
        System.out.println("-----------------------------------");

        
    }

    public int getQuantProjects() {
        return quantProjects;
    }

    public void setQuantProjects(int quantProjects) {
        this.quantProjects = quantProjects;
    }
    
    
}
