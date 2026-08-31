package estudosJava.javacore.Hherança.domain;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String cargo, double salario, String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }



    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Sálario: R$"+this.salario);
        System.out.println("Cargo: "+this.cargo);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
