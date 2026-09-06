package estudosJava.javacore.LclassesAbstratas.domain;

public class Gerente extends FuncionarioAbstract {
    @Override
    public String cargo() {
        return "Gerente";
    }

    @Override
    public int bonus() {
        return 30;
    }

    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double calcularBonus(){
        return this.salary = salary + salary * 0.3;
    }
}
