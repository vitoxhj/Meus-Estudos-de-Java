package estudosJava.javacore.LclassesAbstratas.domain;

public abstract class TrabalhadorAbstract {
    protected String name;
    protected String cpf;
    protected double salary;

    public TrabalhadorAbstract(String cpf, String name, double salary) {
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public abstract void calcularSalario();

    public abstract void trabalhar();
}
