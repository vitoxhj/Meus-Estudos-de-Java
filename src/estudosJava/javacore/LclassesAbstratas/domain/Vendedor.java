package estudosJava.javacore.LclassesAbstratas.domain;

public class Vendedor extends FuncionarioAbstract {
    @Override
    public String cargo() {
        return "Vendedor";
    }

    @Override
    public int bonus() {
        return 10;
    }

    public Vendedor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Desenvolvedor{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularBonus(){
        return this.salary = salary + salary * 0.1;
    }
}
